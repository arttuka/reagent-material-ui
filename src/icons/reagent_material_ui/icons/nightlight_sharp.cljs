(ns reagent-material-ui.icons.nightlight-sharp
  "Imports @material-ui/icons/NightlightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def nightlight-sharp (create-svg-icon (e "path" #js {"d" "M14 2c1.82 0 3.53.5 5 1.35-2.99 1.73-5 4.95-5 8.65s2.01 6.92 5 8.65c-1.47.85-3.18 1.35-5 1.35-5.52 0-10-4.48-10-10S8.48 2 14 2z"})
                                       "NightlightSharp"))
