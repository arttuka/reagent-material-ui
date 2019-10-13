(ns reagent-material-ui.icons.local-printshop-sharp
  "Imports @material-ui/icons/LocalPrintshopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-printshop-sharp (create-svg-icon (e "path" #js {"d" "M2 8v9h4v4h12v-4h4V8H2zm14 11H8v-5h8v5zm3-7c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm-1-9H6v4h12V3z"})
                                            "LocalPrintshopSharp"))
