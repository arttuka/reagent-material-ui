(ns reagent-material-ui.icons.tap-and-play-rounded
  "Imports @material-ui/icons/TapAndPlayRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tap-and-play-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 21v2h2c0-1.1-.9-2-2-2zm1.2-3.88c-.55-.1-1.07.24-1.18.78-.11.54.24 1.07.78 1.18 1.58.32 2.8 1.54 3.12 3.12.1.47.51.8.98.8.07 0 .13-.01.2-.02.54-.11.89-.64.78-1.18-.48-2.36-2.32-4.2-4.68-4.68zM17 1.01L7 1c-1.1 0-2 .9-2 2v9h2V6h10v15h-1v2h1c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99z"}) (e "path" #js {"d" "M6.11 13.06c-.56-.05-1.04.34-1.1.88-.06.55.33 1.04.88 1.1 3.68.41 6.65 3.38 7.06 7.06.05.52.49.9.99.9.04 0 .07 0 .11-.01.55-.06.94-.56.88-1.1-.5-4.6-4.22-8.32-8.82-8.83z"}))
                                           "TapAndPlayRounded"))
