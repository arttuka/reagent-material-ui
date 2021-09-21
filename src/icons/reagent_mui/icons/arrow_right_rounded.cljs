(ns reagent-mui.icons.arrow-right-rounded
  "Imports @mui/icons-material/ArrowRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-right-rounded (create-svg-icon (e "path" #js {"d" "m11.71 15.29 2.59-2.59c.39-.39.39-1.02 0-1.41L11.71 8.7c-.63-.62-1.71-.18-1.71.71v5.17c0 .9 1.08 1.34 1.71.71z"})
                                          "ArrowRightRounded"))
