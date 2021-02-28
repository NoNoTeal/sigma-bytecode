public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u7bad\u624e\uf995\uafe7\u6b0d\u36d3 {
    public void \u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ua068\u7bad\u392e\u7330\u7043\ud7e8 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1) {
        var_5_8C : \u40a9\u36d3\u183a\u446c\u3504\ubf56[]
        var_6_97 : Object
        var_7_9B : \u40a9\u36d3\u183a\u446c\u3504\ubf56[]
        var_8_A0 : int
        var_9_A9 : int
        var_10_C4 : \u40a9\u36d3\u183a\u446c\u3504\ubf56
        var_11_CB : String
        var_12_E7 : TranslationTextComponent
        var_13_F2 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u3e2a\u3e75\u071d\u72f1\u7c6b\u873d(\u3e2a\u3e75\u071d\u72f1\u7c6b\u873d::<init>, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, add:int(getfield:int(\ua068\u7bad\u392e\u7330\u7043\ud7e8::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, p0:\ua068\u7bad\u392e\u7330\u7043\ud7e8), ldc:int(45)), getfield:int(\ua068\u7bad\u392e\u7330\u7043\ud7e8::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\ua068\u7bad\u392e\u7330\u7043\ud7e8), ldc:int(43), sub:int(getfield:int(\ua068\u7bad\u392e\u7330\u7043\ud7e8::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\ua068\u7bad\u392e\u7330\u7043\ud7e8), ldc:int(32)), ldc:int(20))
            putfield:\ua068\u7bad\u392e\u7330\u7043\ud7e8(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u4492\u960f\u3d64\ud158\u8d98\u0a06, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, p0:\ua068\u7bad\u392e\u7330\u7043\ud7e8)
            var_5_8C = checkcast:\u40a9\u36d3\u183a\u446c\u3504\ubf56[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56[].class, invokestatic:Object[][expected:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]](ArrayUtils::clone, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56[][expected:Object[]](\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u61a4\u6d69\u67e9\uc2bd\u760c\u6cfe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            invokestatic:void(Arrays::sort, checkcast:\u40a9\u36d3\u183a\u446c\u3504\ubf56[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56[].class, var_5_8C:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]))
            var_6_97 = aconstnull:Object()
            var_7_9B = var_5_8C:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]
            var_8_A0 = arraylength:int(var_7_9B:\u40a9\u36d3\u183a\u446c\u3504\ubf56[])
            var_9_A9 = and:int(ldc:int(21632), ldc:int(-21633))
            
            while (cmplt:boolean(var_9_A9:int, var_8_A0:int)) {
                var_10_C4 = loadelement:\u40a9\u36d3\u183a\u446c\u3504\ubf56(var_7_9B:\u40a9\u36d3\u183a\u446c\u3504\ubf56[], var_9_A9:int)
                var_11_CB = invokevirtual:String(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u3d4b\u3d64\ub8be\u156b\uc87f\u8aa5, var_10_C4:\u40a9\u36d3\u183a\u446c\u3504\ubf56)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_11_CB:String, var_6_97:Object))) {
                    var_6_97 = var_11_CB:String[expected:Object]
                    invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe>], initobject:\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe(\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe::<init>, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, initobject:TranslationTextComponent(TranslationTextComponent::<init>, var_11_CB:String)))
                }
                
                var_12_E7 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, invokevirtual:String(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\uf9c5\uf995\ube23\u5db4\u071d\u9937, var_10_C4:\u40a9\u36d3\u183a\u446c\u3504\ubf56))
                var_13_F2 = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_12_E7:TranslationTextComponent[expected:ITextProperties])
                
                if (cmpgt:boolean(var_13_F2:int, getfield:int(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\ud36e\uc2bd\ub102\u97e6\u7049\ub83f, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3))) {
                    putfield:int(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\ud36e\uc2bd\ub102\u97e6\u7049\ub83f, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, var_13_F2:int)
                }
                
                invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u6c52\u416d\u385b\ud7e8\ufcaf\u9937>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u6c52\u416d\u385b\ud7e8\ufcaf\u9937>], initobject:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::<init>, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, var_10_C4:\u40a9\u36d3\u183a\u446c\u3504\ubf56, var_12_E7:TranslationTextComponent[expected:ITextComponent], aconstnull:\u97e6\u4975\u836c\u7ce1\u36d3\ucb79()))
                inc:int(var_9_A9, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6d69\u8308\u8aa5\uceb8\u9255\u4975() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(add:int(invokespecial:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\u6d69\u8308\u8aa5\uceb8\u9255\u4975, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308>]), ldc:int(15)))
        }
        
        goto(Label_0006)
    }
    
    public int \u6d69\uafe7\u3bc9\u0a06\u0800\u51b2() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(add:int(invokespecial:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\u6d69\uafe7\u3bc9\u0a06\u0800\u51b2, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308>]), ldc:int(32)))
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\ua068\u7bad\u392e\u7330\u7043\ud7e8 \uc4d2\u5654\u6d99\u6435\u6d99\u3504(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u7bad\u624e\uf995\uafe7\u6b0d\u36d3 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\ua068\u7bad\u392e\u7330\u7043\ud7e8(getfield:\ua068\u7bad\u392e\u7330\u7043\ud7e8(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u4492\u960f\u3d64\ud158\u8d98\u0a06, p0:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3))
        }
        
        goto(Label_0006)
    }
    
    public static int \u416d\u76bc\u8308\ud217\u61a4\u12cb(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u7bad\u624e\uf995\uafe7\u6b0d\u36d3 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\ud36e\uc2bd\ub102\u97e6\u7049\ub83f, p0:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FE : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_609 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5FE = and:int(ldc:int(1376460419), ldc:int(-837067103))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-559415297))
            var_5_7D = and:int(ldc:int(9027), ldc:int(-9036))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14877), ldc:int(14868)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FE:int, ldc:int(-1020322098))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(20545), ldc:int(1037)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_CA:int, ldc:int(2123890371))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(195), ldc:int(5381)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(629378871))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(624097293))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(288877973))
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1927772152))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(220795859))
                    }
                    else {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1932500902))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(716069477))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1032492511))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-719794556))
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1547038977))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1353428369))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1338236804))
                            var_11_DB = and:int(ldc:int(-4167), ldc:int(4166))
                            goto(Label_1427)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1966745643))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1726816014))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-202007624))
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-746864998))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-287636414))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(768069904))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-174321069))
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1087544147))
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1557161869))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2109241949))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-131907375))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1543314438))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-223904093))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-101249291))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1008919380))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1636455981))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-453852753))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-141598993))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8206), ldc:int(8207))
                                goto(Label_1053)
                            }
                        }
                    }
                    
                    Label_0919:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(28297974))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-539545847))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1537195921))
                        var_11_DB = and:int(ldc:int(-2950), ldc:int(2949))
                    }
                    
                    Label_1053:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-771817100))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1234659345))
                            goto(Label_0919)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-472321583))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(432421988))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-827899990))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1169:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1053)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(353279731))
                            goto(Label_0919)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-920067021))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1476387031))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1467981704))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1427)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1288:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(405336112))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-895343107))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-74208385))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1688948550))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1115910669))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(1671421890))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1510016303))
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-422126299))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1688518620))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-234144028))
                        var_17_609 = add:int(var_16_109:int, and:int(ldc:int(17553), ldc:int(6155)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(-769974561))
                
                if (cmple:boolean(var_5_7D = var_17_609:int, sub:int(var_6_84:int, xor:int(ldc:int(5648), ldc:int(5649))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
