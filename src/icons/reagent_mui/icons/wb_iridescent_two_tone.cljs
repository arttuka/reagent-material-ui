(ns reagent-mui.icons.wb-iridescent-two-tone
  "Imports @mui/icons-material/WbIridescentTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-iridescent-two-tone (create-svg-icon [(e "path" #js {"d" "M7 11h10v2H7z", "opacity" ".3"}) (e "path" #js {"d" "M5 15h14V9H5v6zm2-4h10v2H7v-2zm4-10h2v3h-2zm6.25 4.39 1.41 1.41 1.8-1.79-1.42-1.41zM11 20h2v3h-2zm6.24-1.29 1.79 1.8 1.42-1.42-1.8-1.79zM5.34 6.805l-1.788-1.79L4.96 3.61l1.788 1.788zM3.55 19.08l1.41 1.42 1.79-1.8-1.41-1.41z"})]
                                             "WbIridescentTwoTone"))
