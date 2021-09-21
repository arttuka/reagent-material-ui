(ns reagent-mui.icons.museum-outlined
  "Imports @mui/icons-material/MuseumOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def museum-outlined (create-svg-icon [(e "path" #js {"d" "M22 11V9L12 2 2 9v2h2v9H2v2h20v-2h-2v-9h2zm-4 9H6V9h12v11z"}) (e "path" #js {"d" "m10 14 2 3 2-3v4h2v-7h-2l-2 3-2-3H8v7h2z"})]
                                      "MuseumOutlined"))
