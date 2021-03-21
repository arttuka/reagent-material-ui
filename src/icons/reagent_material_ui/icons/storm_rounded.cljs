(ns reagent-material-ui.icons.storm-rounded
  "Imports @material-ui/icons/StormRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def storm-rounded (create-svg-icon (e "path" #js {"d" "M18.93 8C16.72 4.18 11.82 2.87 8 5.07c-1.41.82-2.48 2-3.16 3.37-.1-1.75.1-3.5.59-5.17C5.61 2.63 5.14 2 4.48 2h-.01c-.43 0-.83.28-.95.7-1.28 4.31-.87 9.11 1.55 13.3 1.1 1.91 2.88 3.19 4.86 3.72 1.98.53 4.16.31 6.07-.79 1.41-.82 2.48-2 3.16-3.37.1 1.75-.09 3.5-.58 5.18-.18.63.29 1.26.95 1.26.44 0 .83-.28.95-.7 1.27-4.31.87-9.11-1.55-13.3zM15 17.2c-2.87 1.65-6.54.67-8.2-2.2-.11-.2-.21-.4-.3-.6-1.2-2.76-.17-6.06 2.5-7.6 2.86-1.65 6.54-.67 8.2 2.2.11.2.21.4.3.6 1.2 2.76.17 6.06-2.5 7.6zM12 10c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2m0-2c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4z"})
                                    "StormRounded"))
