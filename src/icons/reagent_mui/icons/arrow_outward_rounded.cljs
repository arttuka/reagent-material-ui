(ns reagent-mui.icons.arrow-outward-rounded
  "Imports @mui/icons-material/ArrowOutwardRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-outward-rounded (create-svg-icon (e "path" #js {"d" "M6 7c0 .55.45 1 1 1h7.59l-8.88 8.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L16 9.41V17c0 .55.45 1 1 1s1-.45 1-1V7c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1z"})
                                            "ArrowOutwardRounded"))
