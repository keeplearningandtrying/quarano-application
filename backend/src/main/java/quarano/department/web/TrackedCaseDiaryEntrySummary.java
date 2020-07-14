package quarano.department.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.hateoas.RepresentationModel;
import quarano.core.web.MapperWrapper;
import quarano.diary.DiaryEntry;
import quarano.reference.SymptomDto;
import quarano.tracking.ContactPerson;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Marco Ebbinghaus
 */
public class TrackedCaseDiaryEntrySummary extends RepresentationModel<TrackedCaseDiaryEntrySummary> {

	private final DiaryEntry entry;
	private final MessageSourceAccessor messages;
	private final MapperWrapper mapper;

	public TrackedCaseDiaryEntrySummary(DiaryEntry diaryEntry, MessageSourceAccessor messages, MapperWrapper mapper) {
		this.entry = diaryEntry;
		this.messages = messages;
		this.mapper = mapper;
	}

	public String getId() {
		return entry.getId().toString();
	}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public Map<String, Object> getSlot() {

		var slot = entry.getSlot();

		return Map.of("date", slot.getDate(), "timeOfDay", slot.getTimeOfDay().name().toLowerCase(Locale.US));
	}

	public LocalDateTime getReportedAt() {
		return entry.getDateTime();
	}

	public float getBodyTemperature() {
		return entry.getBodyTemperature().getValue();
	}

	public Stream<?> getContacts() {
		return entry.getContacts().stream()
				.map(ContactSummary::new);
	}

	public Stream<SymptomDto> getSymptoms() {

		return entry.getSymptoms().stream()
				.map(it -> mapper.map(it, SymptomDto.class));
	}

	@RequiredArgsConstructor
	static class ContactSummary {

		private final ContactPerson contact;

		public String getId() {
			return contact.getId().toString();
		}

		public String getFirstName() {
			return contact.getFirstName();
		}

		public String getLastName() {
			return contact.getLastName();
		}
	}
}
