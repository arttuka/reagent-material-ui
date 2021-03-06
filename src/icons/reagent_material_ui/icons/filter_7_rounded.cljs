(ns reagent-material-ui.icons.filter-7-rounded
  "Imports @material-ui/icons/Filter7Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-7-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3.17 5.34l-3.58 7.16c-.15.3-.46.49-.8.49-.66 0-1.1-.7-.8-1.29L15 7h-3c-.55 0-1-.45-1-1s.45-1 1-1h3.38c.9 0 1.62.72 1.62 1.62 0 .25-.06.5-.17.72z"}) (e "path" #js {"d" "M17 20H4V7c0-.55-.45-1-1-1s-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1z"}))
                                       "Filter7Rounded"))
