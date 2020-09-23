(ns reagent-material-ui.icons.eject
  "Imports @material-ui/icons/Eject as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def eject (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34z"})
                            "Eject"))
