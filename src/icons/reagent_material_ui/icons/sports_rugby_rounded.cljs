(ns reagent-material-ui.icons.sports-rugby-rounded
  "Imports @material-ui/icons/SportsRugbyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-rugby-rounded (create-svg-icon (e "path" #js {"d" "M20.53 3.47c-.56-.56-2.16-.97-4.18-.97-3.1 0-7.19.96-10.03 3.81-4.71 4.72-4.27 12.79-2.85 14.22.56.56 2.16.97 4.18.97 3.1 0 7.19-.96 10.03-3.81 4.71-4.72 4.27-12.79 2.85-14.22zM7.74 7.74c2.65-2.65 6.38-3.13 8.07-3.2-2.06.94-4.48 2.46-6.64 4.63-2.17 2.17-3.69 4.6-4.64 6.66.09-2.49.88-5.77 3.21-8.09zm8.52 8.52c-2.65 2.65-6.38 3.13-8.07 3.2 2.06-.94 4.48-2.46 6.64-4.63 2.17-2.17 3.69-4.6 4.64-6.66-.09 2.49-.88 5.77-3.21 8.09z"})
                                           "SportsRugbyRounded"))
