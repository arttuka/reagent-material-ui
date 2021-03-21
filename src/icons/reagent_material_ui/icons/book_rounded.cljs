(ns reagent-material-ui.icons.book-rounded
  "Imports @material-ui/icons/BookRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def book-rounded (create-svg-icon (e "path" #js {"d" "M4 4v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2H6c-1.1 0-2 .9-2 2zm7 0h5v6.12c0 .39-.42.63-.76.43L13.5 9.5l-1.74 1.05c-.33.2-.76-.04-.76-.43V4z"})
                                   "BookRounded"))
