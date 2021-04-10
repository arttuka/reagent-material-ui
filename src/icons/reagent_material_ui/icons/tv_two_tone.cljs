(ns reagent-material-ui.icons.tv-two-tone
  "Imports @material-ui/icons/TvTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tv-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 5h18v12H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h5v2h8v-2h5c1.1 0 1.99-.9 1.99-2L23 5c0-1.1-.9-2-2-2zm0 14H3V5h18v12z"}))
                                  "TvTwoTone"))
