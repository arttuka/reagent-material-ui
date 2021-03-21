(ns reagent-material-ui.icons.cottage-two-tone
  "Imports @material-ui/icons/CottageTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cottage-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 19h-5v-4h-2v4H6v-8.9l6-4.58 6 4.58z", "opacity" ".3"}) (e "path" #js {"d" "M12 3L6 7.58V6H4v3.11L1 11.4l1.21 1.59L4 11.62V21h16v-9.38l1.79 1.36L23 11.4 12 3zm6 16h-5v-4h-2v4H6v-8.9l6-4.58 6 4.58V19zM10 1c0 1.66-1.34 3-3 3-.55 0-1 .45-1 1H4c0-1.66 1.34-3 3-3 .55 0 1-.45 1-1h2z"}))
                                       "CottageTwoTone"))
