(ns reagent-material-ui.icons.library-add-check-rounded
  "Imports @material-ui/icons/LibraryAddCheckRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def library-add-check-rounded (create-svg-icon (e "path" #js {"d" "M17 20H4V7c0-.55-.45-1-1-1s-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1zm3-18H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-2.11 6.59l-4.24 4.24c-.39.39-1.02.39-1.41 0l-2.12-2.12a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l1.41 1.41 3.54-3.54c.39-.39 1.02-.39 1.41 0 .39.39.39 1.03 0 1.42z"})
                                                "LibraryAddCheckRounded"))
