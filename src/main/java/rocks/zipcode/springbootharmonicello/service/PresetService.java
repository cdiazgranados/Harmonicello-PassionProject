package rocks.zipcode.springbootharmonicello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.springbootharmonicello.model.Preset;
import rocks.zipcode.springbootharmonicello.repository.PresetRepository;

import java.util.List;


@Service
public class PresetService {

    @Autowired
    private PresetRepository presetRepository;

    public void savePreset(Preset preset) { // CREATE/POST
        presetRepository.save(preset);
    }

    public List<Preset> getAll() { // READ/GET/Plural
        return presetRepository.findAll();
    }

    public Preset getPresetByID(Integer id) {
        return presetRepository.findById(id).get();
    }

    public void delete(Integer id) {
        presetRepository.deleteById(id);
    }
}
