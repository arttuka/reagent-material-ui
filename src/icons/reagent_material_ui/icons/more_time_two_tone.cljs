(ns reagent-material-ui.icons.more-time-two-tone
  "Imports @material-ui/icons/MoreTimeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def more-time-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 8v6l4.7 2.9.8-1.2-4-2.4V8z"}) (e "path" #js {"d" "M17.92 12c.05.33.08.66.08 1 0 3.9-3.1 7-7 7s-7-3.1-7-7 3.1-7 7-7c.7 0 1.37.1 2 .29V4.23c-.64-.15-1.31-.23-2-.23-5 0-9 4-9 9s4 9 9 9 9-4 9-9c0-.34-.02-.67-.06-1h-2.02z"}) (e "path" #js {"d" "M20 5V2h-2v3h-3v2h3v3h2V7h3V5z"}))
                                         "MoreTimeTwoTone"))
