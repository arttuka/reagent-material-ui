(ns reagent-material-ui.icons.filter-rounded
  "Imports @material-ui/icons/FilterRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM9.6 13.2l1.38-1.83c.2-.27.6-.27.8 0L13 13l2.23-2.97c.2-.27.6-.27.8 0l2.38 3.17c.25.33.01.8-.4.8h-8c-.42 0-.66-.47-.41-.8z"}) (e "path" #js {"d" "M3 6c-.55 0-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1H4V7c0-.55-.45-1-1-1z"}))
                                     "FilterRounded"))
