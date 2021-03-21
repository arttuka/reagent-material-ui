(ns reagent-material-ui.icons.directions-run-rounded
  "Imports @material-ui/icons/DirectionsRunRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def directions-run-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "3.5", "r" "2", "cx" "13.5"}) (e "path" #js {"d" "M19 11.91c0-.49-.36-.9-.84-.98-1.53-.25-2.79-1.16-3.47-2.35l-1-1.58c-.4-.6-1-1-1.7-1-.68 0-1.28.28-4.77 1.76C6.49 8.07 6 8.8 6 9.6V12c0 .55.45 1 1 1s1-.45 1-1V9.58l1.79-.7-1.6 8.1-3.79-.79c-.55-.12-1.09.24-1.21.8-.11.55.25 1.08.79 1.2l3.98.81c1.06.22 2.11-.46 2.35-1.52l.57-2.49 2.11 2V22c0 .55.45 1 1 1s1-.45 1-1v-5.66c0-.55-.23-1.07-.62-1.45l-1.49-1.41.6-3c1.07 1.24 2.63 2.15 4.37 2.43.61.1 1.15-.39 1.15-1z"}))
                                             "DirectionsRunRounded"))
