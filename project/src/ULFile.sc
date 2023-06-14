theme: /uploadingFile
    
    state: GoingToDLFile
        q!: * ~файл * 
        go!: /uploadingFile/AttachFile
    
    state: AttachFile
        InputFile:
            prompt = Загрузите в чат файл, и я загружу его в хранилище и отправлю вам ссылку.
            varName = fileUrl
            then = /uploadingFile/AttachFile/Save
            errorState  = /uploadingFile/AttachFile/Error

        state: Save
            a: Успех! Файл доступен по ссылке: {{$session.fileUrl}}
            go!: /uploadingFile/AttachFile

        state: Error
            a: Извините, у меня не получилось обработать файл.