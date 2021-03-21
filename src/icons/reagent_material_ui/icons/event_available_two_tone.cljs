(ns reagent-material-ui.icons.event-available-two-tone
  "Imports @material-ui/icons/EventAvailableTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def event-available-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5h14v2H5z", "opacity" ".3"}) (e "path" #js {"d" "M19 3h-1V1h-2v2H8V1H6v2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V9h14v10zm0-12H5V5h14v2zm-2.51 4.53l-1.06-1.06-4.87 4.87-2.11-2.11-1.06 1.06 3.17 3.17z"}))
                                               "EventAvailableTwoTone"))
