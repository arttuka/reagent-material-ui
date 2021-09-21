(ns reagent-mui.icons.power-rounded
  "Imports @mui/icons-material/PowerRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def power-rounded (create-svg-icon (e "path" #js {"d" "M16.01 7 16 4c0-.55-.45-1-1-1s-1 .45-1 1v3h-4V4c0-.55-.45-1-1-1s-1 .45-1 1v3h-.01C6.9 7 6 7.9 6 8.99v4.66c0 .53.21 1.04.58 1.41L9.5 18v2c0 .55.45 1 1 1h3c.55 0 1-.45 1-1v-2l2.92-2.92c.37-.38.58-.89.58-1.42V8.99C18 7.89 17.11 7 16.01 7z"})
                                    "PowerRounded"))
