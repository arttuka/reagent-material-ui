(ns reagent-material-ui.icons.device-unknown-sharp
  "Imports @material-ui/icons/DeviceUnknownSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def device-unknown-sharp (create-svg-icon (e "path" #js {"d" "M19 1H5v22h14V1zm-2 18H7V5h10v14zM12 6.72c-1.96 0-3.5 1.52-3.5 3.47h1.75c0-.93.82-1.75 1.75-1.75s1.75.82 1.75 1.75c0 1.75-2.63 1.57-2.63 4.45h1.76c0-1.96 2.62-2.19 2.62-4.45 0-1.96-1.54-3.47-3.5-3.47zM11 16h2v2h-2v-2z"})
                                           "DeviceUnknownSharp"))
