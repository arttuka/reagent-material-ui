(ns reagent-mui.icons.nature-people-two-tone
  "Imports @mui/icons-material/NaturePeopleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def nature-people-two-tone (create-svg-icon [(e "circle" #js {"cx" "15.17", "cy" "9.17", "r" "5", "opacity" ".3"}) (e "circle" #js {"cx" "4.5", "cy" "9.5", "r" "1.5"}) (e "path" #js {"d" "M15.17 2.17c-3.87 0-7 3.13-7 7 0 3.47 2.52 6.34 5.83 6.89V20H6v-3h1v-4c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v4h1v5h16v-2h-3v-3.88c3.47-.41 6.17-3.36 6.17-6.95 0-3.87-3.13-7-7-7zm0 12c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})]
                                             "NaturePeopleTwoTone"))
