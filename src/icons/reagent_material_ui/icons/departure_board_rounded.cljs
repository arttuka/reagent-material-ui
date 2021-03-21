(ns reagent-material-ui.icons.departure-board-rounded
  "Imports @material-ui/icons/DepartureBoardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def departure-board-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 11V8h7.29c-.77-2.6.21-4.61.37-4.97C2.97 2.67 2 5.02 2 7v9.5c0 .95.38 1.81 1 2.44v1.56c0 .82.67 1.5 1.5 1.5S6 21.32 6 20.5V20h8v.5c0 .82.67 1.5 1.5 1.5s1.5-.68 1.5-1.5v-1.56c.62-.63 1-1.49 1-2.44V13c-1.91 0-3.63-.76-4.89-2H4zm2.5 6c-.83 0-1.5-.67-1.5-1.5S5.67 14 6.5 14s1.5.67 1.5 1.5S7.33 17 6.5 17zm8.5-1.5c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5.67-1.5 1.5-1.5 1.5.67 1.5 1.5z"}) (e "path" #js {"d" "M18 1c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm2.02 7.03c-.2.2-.51.2-.71 0l-1.67-1.67c-.1-.1-.15-.23-.15-.36V3.5c0-.28.22-.5.5-.5s.5.22.5.5v2.29l1.53 1.53c.19.19.19.51 0 .71z"}))
                                              "DepartureBoardRounded"))
