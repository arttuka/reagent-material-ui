(ns reagent-material-ui.icons.battery-unknown-rounded
  "Imports @material-ui/icons/BatteryUnknownRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-unknown-rounded (create-svg-icon (e "path" #js {"d" "M14 4V3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v1H8c-.55 0-1 .45-1 1v16c0 .55.45 1 1 1h8c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1h-2zm-1.99 14c-.59 0-1.05-.47-1.05-1.05 0-.59.47-1.04 1.05-1.04.59 0 1.04.45 1.04 1.04-.01.58-.45 1.05-1.04 1.05zm2.5-6.17c-.63.93-1.23 1.21-1.56 1.81-.08.14-.13.26-.16.49-.05.39-.36.68-.75.68h-.03c-.44 0-.79-.38-.75-.82.03-.28.09-.57.25-.84.41-.73 1.18-1.16 1.63-1.8.48-.68.21-1.94-1.14-1.94-.61 0-1.01.32-1.26.7-.19.29-.57.39-.89.25-.42-.18-.6-.7-.34-1.07.51-.74 1.36-1.29 2.48-1.29 1.23 0 2.08.56 2.51 1.26.37.61.58 1.73.01 2.57z"})
                                              "BatteryUnknownRounded"))
