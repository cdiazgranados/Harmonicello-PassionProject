package rocks.zipcode.springbootharmonicello.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity(name = "presets")
public class Preset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Integer hertz;
    private String waveform;
    private String instrument;
    private Boolean sustain;

    public Preset() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHertz() {
        return hertz;
    }

    public void setHertz(Integer hertz) {
        this.hertz = hertz;
    }

    public String getWaveform() {
        return waveform;
    }

    public void setWaveform(String waveform) {
        this.waveform = waveform;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Boolean getSustain() {
        return sustain;
    }

    public void setSustain(Boolean sustain) {
        this.sustain = sustain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Preset preset = (Preset) o;
        return Objects.equals(id, preset.id) && Objects.equals(title, preset.title)
                && Objects.equals(hertz, preset.hertz) && Objects.equals(waveform, preset.waveform)
                && Objects.equals(instrument, preset.instrument) && Objects.equals(sustain, preset.sustain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, hertz, waveform, instrument, sustain);
    }

    @Override
    public String toString() {
        return "Preset{" +
                "id=" + id +
                ", presetTitle='" + title + '\'' +
                ", hertz=" + hertz +
                ", waveform='" + waveform + '\'' +
                ", instrument='" + instrument + '\'' +
                ", sustain=" + sustain +
                '}';
    }
}
