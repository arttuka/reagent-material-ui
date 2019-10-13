(ns reagent-material-ui.icons.file-copy-sharp
  "Imports @material-ui/icons/FileCopySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def file-copy-sharp (create-svg-icon (e "path" #js {"d" "M16 1H2v16h2V3h12V1zm-1 4l6 6v12H6V5h9zm-1 7h5.5L14 6.5V12z"})
                                      "FileCopySharp"))
