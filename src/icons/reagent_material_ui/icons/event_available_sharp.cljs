(ns reagent-material-ui.icons.event-available-sharp
  "Imports @material-ui/icons/EventAvailableSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-available-sharp (create-svg-icon (e "path" #js {"d" "M16.53 11.06L15.47 10l-4.88 4.88-2.12-2.12-1.06 1.06L10.59 17l5.94-5.94zM21 3h-3V1h-2v2H8V1H6v2H3v18h18V3zm-2 16H5V8h14v11z"})
                                            "EventAvailableSharp"))
