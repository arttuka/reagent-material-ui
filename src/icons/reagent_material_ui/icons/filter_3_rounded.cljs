(ns reagent-material-ui.icons.filter-3-rounded
  "Imports @material-ui/icons/Filter3Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-3-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3 6.5c0 .83-.67 1.5-1.5 1.5.83 0 1.5.67 1.5 1.5V13c0 1.1-.9 2-2 2h-3c-.55 0-1-.45-1-1s.45-1 1-1h3v-2h-1c-.55 0-1-.45-1-1s.45-1 1-1h1V7h-3c-.55 0-1-.45-1-1s.45-1 1-1h3c1.1 0 2 .9 2 2v1.5z"}) (e "path" #js {"d" "M17 20H4V7c0-.55-.45-1-1-1s-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1z"}))
                                       "Filter3Rounded"))
