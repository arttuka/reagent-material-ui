(ns reagent-mui.icons.ice-skating-two-tone
  "Imports @mui/icons-material/IceSkatingTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ice-skating-two-tone (create-svg-icon [(e "path" #js {"d" "M5 16V5h5v1H8.5c-.28 0-.5.22-.5.5s.22.5.5.5H10l.1 1H8.5c-.28 0-.5.22-.5.5s.22.5.5.5h1.81c.45 1.12 1.4 2.01 2.6 2.36l2.62.73C16.4 12.33 17 13.1 17 14v2H5z", "opacity" ".3"}) (e "path" #js {"d" "M21 17c0 1.66-1.34 3-3 3h-2v-2h3v-4c0-1.79-1.19-3.34-2.91-3.82l-2.62-.74C12.62 9.19 12 8.39 12 7.5V3H3v15h3v2H2v2h16c2.76 0 5-2.24 5-5h-2zM5 16V5h5v1H8.5c-.28 0-.5.22-.5.5s.22.5.5.5H10l.1 1H8.5c-.28 0-.5.22-.5.5s.22.5.5.5h1.81c.45 1.12 1.4 2.01 2.6 2.36l2.62.73C16.4 12.33 17 13.1 17 14v2H5zm9 4H8v-2h6v2z"})]
                                           "IceSkatingTwoTone"))
