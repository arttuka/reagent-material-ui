(ns reagent-mui.icons.style-two-tone
  "Imports @mui/icons-material/StyleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def style-two-tone (create-svg-icon [(e "path" #js {"d" "M15.22 4.75 7.87 7.79l4.96 11.96 7.35-3.05-4.96-11.95zM11 10c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z", "opacity" ".3"}) (e "path" #js {"d" "m3.87 11.18-2.43 5.86c-.41 1.02.08 2.19 1.09 2.61l1.34.56v-9.03zm18.16 4.77L17.07 3.98c-.31-.75-1.04-1.21-1.81-1.23-.26 0-.53.04-.79.15L7.1 5.95c-.75.31-1.21 1.03-1.23 1.8-.01.27.04.54.15.8l4.96 11.97c.31.76 1.05 1.22 1.83 1.23.26 0 .52-.05.77-.15l7.36-3.05c1.02-.42 1.51-1.59 1.09-2.6zm-9.2 3.8L7.87 7.79l7.35-3.04h.01l4.95 11.95-7.35 3.05z"}) (e "circle" #js {"cx" "11", "cy" "9", "r" "1"}) (e "path" #js {"d" "m9.33 21.75-3.45-8.34v6.34c0 1.1.9 2 2 2h1.45z"})]
                                     "StyleTwoTone"))
