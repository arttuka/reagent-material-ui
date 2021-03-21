(ns reagent-material-ui.icons.filter-6-rounded
  "Imports @material-ui/icons/Filter6Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-6-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3 11c0 1.1-.9 2-2 2h-2c-1.1 0-2-.9-2-2V7c0-1.1.9-2 2-2h2c.55 0 1 .45 1 1s-.45 1-1 1h-2v2h2c1.1 0 2 .9 2 2v2z"}) (e "path" #js {"d" "M13 11h2v2h-2zm4 9H4V7c0-.55-.45-1-1-1s-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1z"}))
                                       "Filter6Rounded"))
