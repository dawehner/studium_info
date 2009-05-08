;; Die ersten drei Zeilen dieser Datei wurden von DrScheme eingefügt. Sie enthalten Metadaten
;; über die Sprachebene dieser Datei in einer Form, die DrScheme verarbeiten kann.
#reader(lib "DMdA-vanilla-reader.ss" "deinprogramm")((modname song) (read-case-sensitive #f) (teachpacks ()) (deinprogramm-settings #(#f write repeating-decimal #t #t none explicit #f ())))
; Ein Song besteht aus
; - arist String
; - title String
; - duration int
(define-record-procedures song
  make-song song?
  (song-artist song-title song-duration))

(: make-song (string string integer -> song))
(: song? (%a -> boolean))
(: song-artist (song -> string))
(: song-title (song -> string))
(: song-duration (song -> integer))

(define test_metal
  (make-song "Iron Maiden" "The Trooper" 300))
(define test_rock
  (make-song "Alis Cooper" "Poison" 200))
(define test_punk
  (make-song "Beatsteaks" "Hail to the freaks" 320))
(define guns (make-song "guns" "paradice city" 405.3))