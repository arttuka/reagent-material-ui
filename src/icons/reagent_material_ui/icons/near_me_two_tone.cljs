(ns reagent-material-ui.icons.near-me-two-tone
  "Imports @material-ui/icons/NearMeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def near-me-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.39 12.61l.32.83 1.32 3.42 4.24-10.13-10.13 4.24 3.42 1.33z", "opacity" ".3"}) (e "path" #js {"d" "M3 11.51l6.84 2.65L12.48 21h.98L21 3 3 10.53v.98zm14.27-4.78l-4.24 10.13-1.32-3.42-.32-.83-.82-.32-3.43-1.33 10.13-4.23z"}))
                                       "NearMeTwoTone"))
