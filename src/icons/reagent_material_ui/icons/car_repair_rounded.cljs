(ns reagent-material-ui.icons.car-repair-rounded
  "Imports @material-ui/icons/CarRepairRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def car-repair-rounded (create-svg-icon (e "path" #js {"d" "M7 15v-1h10v1c0 .55.45 1 1 1s1-.45 1-1V8.69S17.66 4.66 17.44 4c-.05-.16-.12-.29-.19-.4-.02-.02-.03-.04-.05-.07-.38-.52-.92-.53-.92-.53H7.72s-.54.01-.92.54c-.02.02-.03.04-.05.06-.07.11-.14.24-.19.4C6.34 4.66 5 8.69 5 8.69V15c0 .55.45 1 1 1s1-.45 1-1zm2-3.5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm6 0c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zM8.33 5h7.34l.23.69.43 1.31H7.67l.66-2zM4 18.01c0 .54.45.99.99.99H11v2.01c0 .55.45.99.99.99H12c.55 0 .99-.45.99-.99V19H19c.55 0 .99-.45.99-.99 0-.55-.45-.99-.99-.99H4.99c-.54-.01-.99.44-.99.99z"})
                                         "CarRepairRounded"))
