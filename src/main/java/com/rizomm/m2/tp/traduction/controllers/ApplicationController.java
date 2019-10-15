package com.rizomm.m2.tp.traduction.controllers;

import com.rizomm.m2.tp.traduction.entites.Application;
import com.rizomm.m2.tp.traduction.entites.Entry;
import com.rizomm.m2.tp.traduction.entites.Translation;
import com.rizomm.m2.tp.traduction.services.ApplicationService;
import com.rizomm.m2.tp.traduction.services.EntryService;
import com.rizomm.m2.tp.traduction.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private TranslationService translationService;
    @Autowired
    private EntryService entryService;
    @PostMapping
    public ResponseEntity createApp(@RequestBody @Valid Application application){
        return new ResponseEntity<>(applicationService.createApp(application ), HttpStatus.CREATED);


    }
    @PostMapping("/{id}/translations")
    public ResponseEntity createTrans(@RequestBody @Valid Translation translation, @PathVariable Integer id){
        return new ResponseEntity<>(translationService.createTrans(translation),HttpStatus.CREATED);
    }

    @PutMapping("/{idApp}/translations/{idTrans}/entries/{id}")
    public ResponseEntity updateEntry(@RequestBody @Valid Entry entry, @PathVariable Integer id, @PathVariable Integer idApp, @PathVariable Integer idTrans){
        return  new ResponseEntity<>(entryService.updateEntry(id,entry),HttpStatus.OK);

    }
   @GetMapping("/{idApp}/translations/{idTrans}/entries/{id}")
   public ResponseEntity getEntry( @PathVariable Integer id, @PathVariable Integer idApp, @PathVariable Integer idTrans){
        return  ResponseEntity.ok(entryService.getEntry(id));
   }

   @DeleteMapping("/{idApp}/translations/{idTrans}/entries/{id}")
   public ResponseEntity deleteEntry(@PathVariable Integer id, @PathVariable Integer idApp, @PathVariable Integer idTrans){
        entryService.deleteEntry(id);
        return new ResponseEntity<>(HttpStatus.OK);
   }

}
