(ns reagent-material-ui.icons.control-point-duplicate-two-tone
  "Imports @material-ui/icons/ControlPointDuplicateTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def control-point-duplicate-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 5c-3.86 0-7 3.14-7 7s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm4 8h-3v3h-2v-3h-3v-2h3V8h2v3h3v2z", "opacity" ".3"}) (e "path" #js {"d" "M16 8h-2v3h-3v2h3v3h2v-3h3v-2h-3zm-1-5c-4.96 0-9 4.04-9 9s4.04 9 9 9 9-4.04 9-9-4.04-9-9-9zm0 16c-3.86 0-7-3.14-7-7s3.14-7 7-7 7 3.14 7 7-3.14 7-7 7zM2 12c0-2.79 1.64-5.2 4.01-6.32V3.52C2.52 4.76 0 8.09 0 12s2.52 7.24 6.01 8.48v-2.16C3.64 17.2 2 14.79 2 12z"}))
                                                       "ControlPointDuplicateTwoTone"))
