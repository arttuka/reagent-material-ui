(ns reagent-material-ui.icons.request-page-rounded
  "Imports @material-ui/icons/RequestPageRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def request-page-rounded (create-svg-icon (e "path" #js {"d" "m19.41 7.41-4.83-4.83c-.37-.37-.88-.58-1.41-.58H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V8.83c0-.53-.21-1.04-.59-1.42zM14 12c.55 0 1 .45 1 1v3c0 .55-.45 1-1 1h-1c0 .55-.45 1-1 1s-1-.45-1-1h-1c-.55 0-1-.45-1-1s.45-1 1-1h3v-1h-3c-.55 0-1-.45-1-1v-3c0-.55.45-1 1-1h1c0-.55.45-1 1-1s1 .45 1 1h1c.55 0 1 .45 1 1s-.45 1-1 1h-3v1h3z"})
                                           "RequestPageRounded"))
