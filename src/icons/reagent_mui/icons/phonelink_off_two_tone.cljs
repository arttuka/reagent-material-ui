(ns reagent-mui.icons.phonelink-off-two-tone
  "Imports @mui/icons-material/PhonelinkOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phonelink-off-two-tone (create-svg-icon [(e "path" #js {"d" "M22 17v-7h-4v4.61L20.39 17z", "opacity" ".3"}) (e "path" #js {"d" "M23 8h-6c-.55 0-1 .45-1 1v3.61l2 2V10h4v7h-1.61l2.93 2.93c.39-.13.68-.49.68-.93V9c0-.55-.45-1-1-1zm-1-2V4H7.39l2 2zM.65 2.92l1.82 1.82C2.18 5.08 2 5.52 2 6v11H0v3h17.73l2.35 2.35 1.41-1.41L2.06 1.51.65 2.92zM4 6.27 14.73 17H4V6.27z"})]
                                             "PhonelinkOffTwoTone"))
