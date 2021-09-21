(ns reagent-mui.icons.emoji-flags-two-tone
  "Imports @mui/icons-material/EmojiFlagsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def emoji-flags-two-tone (create-svg-icon [(e "path" #js {"d" "M12 9H7v6h6l1 2h4v-6h-5z", "opacity" ".3"}) (e "path" #js {"d" "m14 9-1-2H7V5.72c.6-.34 1-.98 1-1.72 0-1.1-.9-2-2-2s-2 .9-2 2c0 .74.4 1.38 1 1.72V21h2v-4h5l1 2h7V9h-6zm4 8h-4l-1-2H7V9h5l1 2h5v6z"})]
                                           "EmojiFlagsTwoTone"))
