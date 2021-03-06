(ns reagent-material-ui.icons.hdr-auto
  "Imports @material-ui/icons/HdrAuto as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def hdr-auto (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.04 8.04h-.09l-1.6 4.55h3.29z"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm3.21 15l-.98-2.81H9.78l-1 2.81h-1.9l4.13-11h1.97l4.13 11h-1.9z"}))
                               "HdrAuto"))
