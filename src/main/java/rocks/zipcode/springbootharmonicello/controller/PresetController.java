package rocks.zipcode.springbootharmonicello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.springbootharmonicello.model.Preset;
import rocks.zipcode.springbootharmonicello.service.PresetService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/presets")
public class PresetController {
    @Autowired
    private PresetService presetService;

    @PostMapping("/add")
    public String add(@RequestBody Preset preset) {
        presetService.savePreset(preset);
        return "Preset has been saved";
    }

    @GetMapping("/all")
    public List<Preset> getAllPresets() {
        return presetService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Preset> getPresetById(@PathVariable Integer id) {

        try {
            Preset preset = presetService.getPresetByID(id);
            return new ResponseEntity<Preset>(preset, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Preset>(HttpStatus.NOT_FOUND);
        }

        // return new ResponseEntity<Preset>(presetService.getPresetByID(id),
        // HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Preset> update(@RequestBody Preset preset, @PathVariable Integer id) { // delete
        try {
            presetService.savePreset(preset);
            return new ResponseEntity<Preset>(preset, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Preset>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        presetService.delete(id);
        return "Preset " + id + " has been deleted.";
    }
}
