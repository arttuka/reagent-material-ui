(ns reagent-material-ui.icons.no-flash-sharp
  "Imports @material-ui/icons/NoFlashSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-flash-sharp (create-svg-icon (e "path" #js {"d" "M2.45 2.45L1.04 3.87l5.3 5.3-.2.23H2V22h16v-1.17l2.13 2.13 1.41-1.41L2.45 2.45zM10 20c-2.21 0-4-1.79-4-4 0-1.95 1.4-3.57 3.25-3.92l1.57 1.57c-.26-.09-.53-.15-.82-.15-1.38 0-2.5 1.12-2.5 2.5s1.12 2.5 2.5 2.5 2.5-1.12 2.5-2.5c0-.29-.06-.56-.15-.82l1.57 1.57C13.57 18.6 11.95 20 10 20zm8-4.83L10.83 8h1.75l1.28 1.4H18v5.77zm2.4-9.57H22L19 11V7h-1V2h4l-1.6 3.6z"})
                                     "NoFlashSharp"))
