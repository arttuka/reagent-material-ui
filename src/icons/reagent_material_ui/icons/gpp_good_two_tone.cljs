(ns reagent-material-ui.icons.gpp-good-two-tone
  "Imports @material-ui/icons/GppGoodTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def gpp-good-two-tone (create-svg-icon [(e "path" #js {"d" "M6 6.31v4.78c0 4 2.55 7.7 6 8.83 3.45-1.13 6-4.82 6-8.83V6.31l-6-2.12-6 2.12zm10.6 3.57-5.66 5.66L7.4 12l1.41-1.41 2.12 2.12 4.24-4.24 1.43 1.41z", "opacity" ".3"}) (e "path" #js {"d" "M12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm6 9.09c0 4-2.55 7.7-6 8.83-3.45-1.13-6-4.82-6-8.83V6.31l6-2.12 6 2.12v4.78zm-9.18-.5L7.4 12l3.54 3.54 5.66-5.66-1.41-1.41-4.24 4.24-2.13-2.12z"})]
                                        "GppGoodTwoTone"))