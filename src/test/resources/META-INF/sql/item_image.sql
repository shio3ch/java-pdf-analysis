INSERT
    INTO item_image (id, image)
    VALUES
--        ( 1, pg_read_binary_file('./resources/image/anpan.png') ),
--        ( 2, pg_read_binary_file('./resources/image/breadpan.png') ),
        ( 3, pg_read_binary_file('/META-INF/image/currypan.png') )
;