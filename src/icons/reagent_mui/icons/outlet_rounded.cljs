(ns reagent-mui.icons.outlet-rounded
  "Imports @mui/icons-material/OutletRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def outlet-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM9 12c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v3c0 .55-.45 1-1 1zm4 6h-2c-.55 0-1-.45-1-1v-.89c0-1 .68-1.92 1.66-2.08 1.26-.21 2.34.76 2.34 1.97v1c0 .55-.45 1-1 1zm3-7c0 .55-.45 1-1 1s-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v3z"})
                                     "OutletRounded"))
