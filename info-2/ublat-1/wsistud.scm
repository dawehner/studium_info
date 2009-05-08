;; Die ersten drei Zeilen dieser Datei wurden von DrScheme eingefügt. Sie enthalten Metadaten
;; über die Sprachebene dieser Datei in einer Form, die DrScheme verarbeiten kann.
#reader(lib "DMdA-vanilla-reader.ss" "deinprogramm")((modname wsistud) (read-case-sensitive #f) (teachpacks ()) (deinprogramm-settings #(#f write repeating-decimal #t #t none explicit #f ())))
; ein informatikstudent besteht aus
; - name string
; - fachsemester integer
; - nebenfach string
; - basispraktikum boolean

(define-record-procedures info-student
  make-info-student info-student?
  (info-student-name info-student-fachsemester info-student-nebenfach info-student-basispraktikum))

(: make-info-student (string integer string boolean -> info-student))
(: info-student? (%a -> boolean))
(: info-student-name (info-student -> string))
(: info-student-fachsemester (info-student -> integer))
(: info-student-nebenfach (info-student -> string))
(: info-student-basispraktikum (info-student -> boolean))


; ein Bioinformatikstudent besteht aus
; - name string
; - fachsemester integer
; - tierpsycho boolean

(define-record-procedures bioinfo-student
  make-bioinfo-student bioinfo-student?
  (bioinfo-student-name bioinfo-student-fachsemester bioinfo-student-tierpsycho))

(: make-bioinfo-student (string integer boolean -> bioinfo-student))
(: bioinfo-student? (%a -> boolean))
(: bioinfo-student-name (bioinfo-student -> string))
(: bioinfo-student-fachsemester (bioinfo-student -> integer))
(: bioinfo-student-tierpsycho (bioinfo-student -> boolean))

; ein Nebenfachstudierender besteht aus
; - name string
; - fachsemester integer
; - hauptfach string

(define-record-procedures nebenfachinfo-student
  make-nebenfachinfo-student nebenfachinfo-student?
  (nebenfachinfo-student-name nebenfachinfo-student-fachsemester nebenfachinfo-student-hauptfach))

(: make-nebenfachinfo-student (string integer string -> nebenfachinfo-student))
(: nebenfachinfo-student? (%a -> boolean))
(: nebenfachinfo-student-name (nebenfachinfo-student -> string))
(: nebenfachinfo-student-fachsemester (nebenfachinfo-student -> integer))
(: nebenfachinfo-student-hauptfach (nebenfachinfo-student -> string))