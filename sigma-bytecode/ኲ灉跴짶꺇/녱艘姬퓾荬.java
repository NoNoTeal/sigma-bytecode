public class \u12b2\u7049\u8df4\uc9f6\uae87.\ub171\u8258\u59ec\ud4fe\u836c {
    public void \ub171\u8258\u59ec\ud4fe\u836c() {
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
            invokespecial:Object(Object::<init>, this:\ub171\u8258\u59ec\ud4fe\u836c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u40a9\u67d0\ua61f\uc87f\ubded(boolean p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub1b9\u92ee\u3dd3\ud51e\u5db4 p1, boolean p2, boolean p3) {
        var_5_393 : int
        var_7_70 : \u3d4b\u8c8a\u88c5\u3dd3\ub1b9
        var_8_384 : InterruptedException
        var_5_AE8 : int
        var_8_5C3 : Object
        var_5_64D : int
        var_9_656 : \ud158\u839e\u7006\uc3e3\u446c
        var_11_674 : Serializable
        var_12_6E3 : Method[]
        var_13_6E8 : int
        var_14_6F1 : int
        var_15_727 : Method
        var_16_74E : \ucfaf\u2dcc\uc84e\u6ec6\ubded
        var_17_75D : Class<?>
        var_18_76E : \u6d99\u3a62\u8350\u4c2b\u4975
        var_19_78A : HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>
        var_20_798 : ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>
        var_5_8FC : int
        var_9_908 : \ud158\u839e\u7006\uc3e3\u446c
        var_10_921 : Iterator<\uc246\u71f1\ua068\u59ec\u516c>
        var_10_A22 : \ud158\u839e\u7006\uc3e3\u446c[]
        var_11_A27 : int
        var_12_A30 : int
        var_14_A7A : Iterator<\uc246\u71f1\ua068\u59ec\u516c>
        var_10_AC8 : \u3bc9\u36d3\u4ab3\u8258\u6c52
        var_5_BCC : int
        var_11_BD3 : \ud158\u839e\u7006\uc3e3\u446c[]
        var_12_BD8 : int
        var_13_BE1 : int
        
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
            var_5_393 = and:int(and:int(ldc:int(992481462), ldc:int(1800311390)), ldc:int(1071012246))
            var_7_70 = invokevirtual:\u3d4b\u8c8a\u88c5\u3dd3\ub1b9(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8bb0\u7ce1\u6d99\u527a\u392e, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))
            
            loop {
                Label_0114:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1338)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-2016338243))
                    goto(Label_1229)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1086)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1033774768))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0764)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0629)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(803753005))
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1283750177))
                    
                    if (cmpeq:boolean(getfield:\ub1b9\u92ee\u3dd3\ud51e\u5db4(\u3d4b\u8c8a\u88c5\u3dd3\ub1b9::\u67d0\u7873\uc2bd\u527a\ubb2b, var_7_70:\u3d4b\u8c8a\u88c5\u3dd3\ub1b9), aconstnull:\ub1b9\u92ee\u3dd3\ud51e\u5db4())) {
                        goto(Label_0504)
                    }
                }
                
                Label_0231:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1338)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(4)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1485525782))
                    goto(Label_1229)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(504547043))
                    goto(Label_1086)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(2)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1128000116))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0764)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0629)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-669504481))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-1048464142))
                        loopcontinue()
                    }
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(861772414))
                }
                
                Label_0360:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-2014062717))
                    goto(Label_1338)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(925544300))
                    goto(Label_1229)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(512)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1300627559))
                    goto(Label_1086)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(536870912)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(269900491))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(-294174513))
                    goto(Label_0764)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0629)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(536870912)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1394663493))
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    return:void()
                }
                
                loopcontinue()
                Label_0504:
                
                if (getstatic:boolean(\u4ab3\uc84e\ucb79\u67e9\u4cd9::\u8d98\u946b\u51b2\u416d\u494c)) {
                    putfield:\ub1b9\u92ee\u3dd3\ud51e\u5db4(\u3d4b\u8c8a\u88c5\u3dd3\ub1b9::\u67d0\u7873\uc2bd\u527a\ubb2b, var_7_70:\u3d4b\u8c8a\u88c5\u3dd3\ub1b9, p1:\ub1b9\u92ee\u3dd3\ud51e\u5db4)
                    goto(Label_0960)
                }
                
                Label_0510:
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(464640742))
                    goto(Label_1338)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1229)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1860978448))
                    goto(Label_1086)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0764)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(2)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(2021489053))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(1065385969))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(1736268063))
                }
                
                try {
                    Label_0629:
                    
                    while (cmpeq:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1229)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Block_140)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                            var_5_393 = and:int(var_5_393:int, ldc:int(1571167777))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16)), ldc:int(0))) {
                                goto(Block_142)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Block_143)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Block_144)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue(Label_0114)
                            }
                            
                            var_5_393 = and:int(var_5_393:int, ldc:int(-1210649385))
                            invokestatic:void(Thread::sleep, ldc:long(999L))
                        }
                        
                        Label_0764:
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Block_146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(2)), ldc:int(0))) {
                            goto(Block_147)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0960)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        var_5_393 = and:int(var_5_393:int, ldc:int(577326022))
                    }
                    
                    goto(Label_1338)
                    Block_140:
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1237141311))
                    goto(Label_0960)
                    Block_142:
                    var_5_393 = and:int(var_5_393:int, ldc:int(298533623))
                    goto(Label_0510)
                    Block_143:
                    var_5_393 = and:int(var_5_393:int, ldc:int(1479156545))
                    goto(Label_0360)
                    Block_144:
                    var_5_393 = and:int(var_5_393:int, ldc:int(1829614891))
                    goto(Label_0231)
                    Block_146:
                    var_5_393 = and:int(var_5_393:int, ldc:int(2017383033))
                    goto(Label_1338)
                    Block_147:
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1723444917))
                    goto(Label_1229)
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(4)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-1973631349))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0231)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-1640197043))
                        loopcontinue()
                    }
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(1073619326))
                }
                catch (java.lang.InterruptedException var_8_384) {
                    do {
                        if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                            var_5_393 = and:int(var_5_393:int, ldc:int(1029074817))
                        }
                        else {
                            var_5_393 = and:int(var_5_393:int, ldc:int(662353174))
                            invokevirtual:void(Throwable::printStackTrace, var_8_384:InterruptedException[expected:Throwable])
                        }
                    } while (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0)))
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(-1282118946))
                }
                
                goto(Label_0504)
                Label_0960:
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_1338)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1471603339))
                    goto(Label_1229)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-1864005219))
                        goto(Label_0764)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0629)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(132488026))
                        goto(Label_0231)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(64651163))
                        loopcontinue()
                    }
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(989916823))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u600f\u9937\u120d\u6ec6\uc3e3.class, p1:\ub1b9\u92ee\u3dd3\ud51e\u5db4))) {
                        if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u9255\u4179\ubded\u446c\u9033.class, p1:\ub1b9\u92ee\u3dd3\ud51e\u5db4)) {
                            goto(Label_1229)
                        }
                        
                        looporswitchbreak()
                    }
                }
                
                Label_1086:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(819158847))
                    goto(Label_1338)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-173498027))
                        goto(Label_0629)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(1198189185))
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-1776320055))
                        goto(Label_0231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(1777462269))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_1229:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(-312360365))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0629)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_393:int, ldc:int(512)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(2115728627))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(4)), ldc:int(0))) {
                        var_5_393 = and:int(var_5_393:int, ldc:int(1518652468))
                        loopcontinue()
                    }
                    
                    var_5_393 = and:int(var_5_393:int, ldc:int(-12231945))
                }
                
                Label_1338:
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1229)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(462582824))
                    goto(Label_1086)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1048576)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(145000221))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(155317721))
                    goto(Label_0764)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(16)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1684752614))
                    goto(Label_0629)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_5_393:int, ldc:int(8388608)), ldc:int(0))) {
                    var_5_393 = and:int(var_5_393:int, ldc:int(1080218884))
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_5_393:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_5_AE8 = and:int(var_5_393:int, ldc:int(-1148334337))
                var_8_5C3 = invokeinterface:Iterator<Object>[expected:Object](Set<Object>::iterator, getstatic:Set<Object>(\u4ab3\uc84e\ucb79\u67e9\u4cd9::\u983f\u3dd3\u392e\ua61f\u3bc9))
                
                loop {
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_2240)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1893667716))
                        goto(Label_2157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2072686257))
                        goto(Label_2052)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1320444241))
                    }
                    else {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2145995543))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_5C3:Iterator[expected:Object]))) {
                            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u4179\u8bb0\u839e\u3e75\u52d3, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))
                            goto(Label_2052)
                        }
                    }
                    
                    Label_1556:
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1164153596))
                        goto(Label_2240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_2157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1714949864))
                            loopcontinue()
                        }
                        
                        var_5_64D = and:int(var_5_AE8:int, ldc:int(-346716841))
                        var_9_656 = invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_8_5C3:Iterator<\ud158\u839e\u7006\uc3e3\u446c>)
                        var_5_AE8 = and:int(and:int(var_5_64D:int, ldc:int(859164318)), ldc:int(-9205609))
                        var_11_674 = invokevirtual:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>[expected:Serializable](\ud158\u839e\u7006\uc3e3\u446c::getClass, var_9_656:\ud158\u839e\u7006\uc3e3\u446c)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1715)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(4194304)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2011508478))
                                
                                if (cmpeq:boolean(var_11_674:Serializable, aconstnull:Serializable())) {
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_1682:
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16777216)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1189778466))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(4194304)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1004545399))
                            }
                            
                            Label_1715:
                            
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(512)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1613188946))
                                goto(Label_1682)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1292645704))
                            }
                            else {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1155161761))
                                var_12_6E3 = invokevirtual:Method[](Class<T>::getDeclaredMethods, var_11_674:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>)
                                var_13_6E8 = arraylength:int(var_12_6E3:Method[])
                                var_14_6F1 = and:int(ldc:int(-25766), ldc:int(25765))
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(83701113))
                                    }
                                    else {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1148810730))
                                        
                                        if (cmpge:boolean(var_14_6F1:int, var_13_6E8:int)) {
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1558506090))
                                        var_15_727 = loadelement:Method(var_12_6E3:Method[], var_14_6F1:int)
                                        
                                        if (invokevirtual:boolean(\uc910\u3e75\u527a\u446c\u3c25::\u7bad\u8df4\u6ec6\ua6bd\uc9f6, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_15_727:Method)) {
                                            invokevirtual:void(AccessibleObject::setAccessible, var_15_727:Method[expected:AccessibleObject], and:int[expected:boolean](ldc:int(9257), ldc:int(20865)))
                                            var_16_74E = invokevirtual:\ucfaf\u2dcc\uc84e\u6ec6\ubded(\uc910\u3e75\u527a\u446c\u3c25::\u9af2\ud4fe\u40a9\u4ab3\u8413, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_15_727:Method)
                                            var_17_75D = loadelement:Class<?>(invokevirtual:Class<?>[](Method::getParameterTypes, var_15_727:Method), and:int(ldc:int(-8766), ldc:int(8733)))
                                            var_18_76E = initobject:\u6d99\u3a62\u8350\u4c2b\u4975(\u6d99\u3a62\u8350\u4c2b\u4975::<init>, var_9_656:\ud158\u839e\u7006\uc3e3\u446c[expected:Object], var_11_674:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, var_15_727:Method, var_16_74E:\ucfaf\u2dcc\uc84e\u6ec6\ubded)
                                            var_19_78A = checkcast:HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>(java.util.HashMap<java.lang.Class<? extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6435\u385b\uae5d\u7049\u8bb0>, java.util.List<\u12b2\u4e72\u8df4\u67e9\u67e9.\u6d99\u3a62\u8350\u4c2b\u4975>>.class, invokeinterface:HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>>::getOrDefault, getfield:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>>(\uc910\u3e75\u527a\u446c\u3c25::\u8709\u183a\u8350\u156b\u12cb, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), var_11_674:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>[expected:Object], initobject:HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>(HashMap::<init>)))
                                            var_20_798 = checkcast:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>(java.util.ArrayList<\u12b2\u4e72\u8df4\u67e9\u67e9.\u6d99\u3a62\u8350\u4c2b\u4975>.class, invokeinterface:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>(Map<Object, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>::get, var_19_78A:Map<Object, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>, var_17_75D:Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>[expected:Object]))
                                            
                                            if (cmpeq:boolean(var_20_798:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>, aconstnull:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>())) {
                                                invokeinterface:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>(Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>::put, var_19_78A:Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>, var_17_75D:Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, var_20_798 = initobject:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>(ArrayList::<init>))
                                            }
                                            
                                            invokeinterface:boolean(List<?>::add, var_20_798:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>[expected:List<?>], var_18_76E:Object[expected:?])
                                            invokeinterface:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>(Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>::put, var_19_78A:Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>>, var_17_75D:Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, var_20_798:ArrayList<\u6d99\u3a62\u8350\u4c2b\u4975>)
                                            invokeinterface:HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>>::put, getfield:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, Map<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>>(\uc910\u3e75\u527a\u446c\u3c25::\u8709\u183a\u8350\u156b\u12cb, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), var_11_674:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, var_19_78A:HashMap<Class<? extends \u6435\u385b\uae5d\u7049\u8bb0>, List<\u6d99\u3a62\u8350\u4c2b\u4975>>)
                                        }
                                        
                                        inc:int(var_14_6F1, ldc:int(1))
                                    }
                                }
                                
                                var_11_674 = invokevirtual:Class<? super \ud158\u839e\u7006\uc3e3\u446c>(Class<? extends \ud158\u839e\u7006\uc3e3\u446c>::getSuperclass, var_11_674:Class<? extends \ud158\u839e\u7006\uc3e3\u446c>[expected:Serializable])
                            }
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_2052:
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(56868225))
                        goto(Label_2240)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(8639638))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-200668662))
                            goto(Label_1556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-114054071))
                            loopcontinue()
                        }
                        
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1730628094))
                        var_8_5C3 = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(Collection<\ud158\u839e\u7006\uc3e3\u446c>::iterator, invokeinterface:Collection<\ud158\u839e\u7006\uc3e3\u446c>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>::values, invokevirtual:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>(\u3776\u647c\u51fa\u7e3f\ub32d::\uc246\ud171\u8709\u6435\u416d, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))))
                    }
                    
                    Label_2157:
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(972466479))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(4)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2018968646))
                            goto(Label_2052)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(414469927))
                            loopcontinue()
                        }
                        
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-343992001))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_8_5C3:Iterator<\ud158\u839e\u7006\uc3e3\u446c>[expected:Object]))) {
                            looporswitchbreak(Label_3101)
                        }
                    }
                    
                    Label_2240:
                    
                    if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(848365929))
                        goto(Label_2157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(393464496))
                        goto(Label_2052)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_8FC = and:int(var_5_AE8:int, ldc:int(-277518177))
                        var_9_908 = checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_8_5C3:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))
                        var_5_AE8 = and:int(var_5_8FC:int, ldc:int(1065776287))
                        var_10_921 = invokeinterface:Iterator<\uc246\u71f1\ua068\u59ec\u516c>(Collection<\uc246\u71f1\ua068\u59ec\u516c>::iterator, invokeinterface:Collection<\uc246\u71f1\ua068\u59ec\u516c>(Map<String, \uc246\u71f1\ua068\u59ec\u516c>::values, invokevirtual:Map<String, \uc246\u71f1\ua068\u59ec\u516c>(\ud158\u839e\u7006\uc3e3\u446c::\uafe7\uc229\ubefe\u64ab\ub102, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(512)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1906183522))
                                goto(Label_2521)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(231984272))
                                goto(Label_2478)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(1048576)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(603058431))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_10_921:Iterator))) {
                                    if (instanceof:boolean(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\ud158\u839e\u7006\uc3e3\u446c)) {
                                        goto(Label_2478)
                                    }
                                    
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_2403:
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_2521)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16384)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(4)), ldc:int(0))) {
                                    var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1992934271))
                                    loopcontinue()
                                }
                                
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1414728298))
                                invokevirtual:void(\uc246\u71f1\ua068\u59ec\u516c::\u8c8a\u3c25\u156b\uafe7\u99f7, checkcast:\uc246\u71f1\ua068\u59ec\u516c(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c.class, invokeinterface:\uc246\u71f1\ua068\u59ec\u516c(Iterator<\uc246\u71f1\ua068\u59ec\u516c>::next, var_10_921:Iterator<\uc246\u71f1\ua068\u59ec\u516c>)))
                                loopcontinue()
                            }
                            
                            Label_2478:
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(4)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1393603791))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_2403)
                                }
                                
                                if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1073741824)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1731160959))
                            }
                            
                            Label_2521:
                            
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(8388608)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2106399014))
                                goto(Label_2478)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1625018377))
                                goto(Label_2403)
                            }
                            
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1762026559))
                            }
                            else {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(925447294))
                                var_10_A22 = getfield:\ud158\u839e\u7006\uc3e3\u446c[](\u3bc9\u36d3\u4ab3\u8258\u6c52::\u3504\u927d\u7006\u494c\u760c, checkcast:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52))
                                var_11_A27 = arraylength:int(var_10_A22:\ud158\u839e\u7006\uc3e3\u446c[])
                                var_12_A30 = and:int(ldc:int(19843), ldc:int(-19924))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-677574723))
                                    }
                                    else {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(728309686))
                                        
                                        if (cmpge:boolean(var_12_A30:int, var_11_A27:int)) {
                                            looporswitchbreak(Label_2728)
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-275136129))
                                        var_14_A7A = invokeinterface:Iterator<\uc246\u71f1\ua068\u59ec\u516c>(Collection<\uc246\u71f1\ua068\u59ec\u516c>::iterator, invokeinterface:Collection<\uc246\u71f1\ua068\u59ec\u516c>(Map<String, \uc246\u71f1\ua068\u59ec\u516c>::values, invokevirtual:Map<String, \uc246\u71f1\ua068\u59ec\u516c>(\ud158\u839e\u7006\uc3e3\u446c::\uafe7\uc229\ubefe\u64ab\ub102, loadelement:\ud158\u839e\u7006\uc3e3\u446c(var_10_A22:\ud158\u839e\u7006\uc3e3\u446c[], var_12_A30:int))))
                                        
                                        while (invokeinterface:boolean(Iterator::hasNext, var_14_A7A:Iterator)) {
                                            invokevirtual:void(\uc246\u71f1\ua068\u59ec\u516c::\u8c8a\u3c25\u156b\uafe7\u99f7, checkcast:\uc246\u71f1\ua068\u59ec\u516c(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c.class, invokeinterface:\uc246\u71f1\ua068\u59ec\u516c(Iterator<\uc246\u71f1\ua068\u59ec\u516c>::next, var_14_A7A:Iterator<\uc246\u71f1\ua068\u59ec\u516c>)))
                                        }
                                        
                                        inc:int(var_12_A30, ldc:int(1))
                                    }
                                }
                            }
                        }
                        
                        Label_2728:
                        
                        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
                            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u7873\u6fb0\u8389\uc7fe\u61a4, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])
                            
                            if (logicalnot:boolean(instanceof:boolean(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c]))) {
                                goto(Label_3094)
                            }
                            
                            var_10_AC8 = checkcast:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52)
                        }
                        else {
                            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u527a\uc7fe\ub70c\uafe7\u6d99, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])
                            
                            if (instanceof:boolean(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
                                var_10_AC8 = checkcast:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, var_9_908:\u3bc9\u36d3\u4ab3\u8258\u6c52)
                                goto(Label_2968)
                            }
                            
                            goto(Label_3094)
                        }
                        
                        Label_2762:
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_2968)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_2881)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(8192)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1981014861))
                        }
                        else {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1089210314))
                            
                            if (cmpeq:boolean(getfield:\ud158\u839e\u7006\uc3e3\u446c(\u3bc9\u36d3\u4ab3\u8258\u6c52::\ub83f\u76bc\u8308\u446c\u51fa, var_10_AC8:\u3bc9\u36d3\u4ab3\u8258\u6c52), aconstnull:\ud158\u839e\u7006\uc3e3\u446c())) {
                                goto(Label_2881)
                            }
                        }
                        
                        Label_2813:
                        
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(16)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(977991667))
                            goto(Label_2968)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(-1083198763))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_2762)
                            }
                            
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(872246239))
                            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u7873\u6fb0\u8389\uc7fe\u61a4, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), getfield:\ud158\u839e\u7006\uc3e3\u446c(\u3bc9\u36d3\u4ab3\u8258\u6c52::\ub83f\u76bc\u8308\u446c\u51fa, var_10_AC8:\u3bc9\u36d3\u4ab3\u8258\u6c52))
                        }
                        
                        Label_2881:
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(1024)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1854131528))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(512)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(2107090845))
                                goto(Label_2813)
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(8388608)), ldc:int(0))) {
                                var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1675202174))
                                goto(Label_3094)
                            }
                            
                            goto(Label_2762)
                        }
                        
                        Label_2968:
                        
                        if (cmpne:boolean(and:int(var_5_AE8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_2881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(514026523))
                            goto(Label_2813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_AE8:int, ldc:int(536870912)), ldc:int(0))) {
                            var_5_AE8 = and:int(var_5_AE8:int, ldc:int(1897987164))
                            goto(Label_2762)
                        }
                        
                        var_5_BCC = and:int(var_5_AE8:int, ldc:int(-284060457))
                        var_11_BD3 = getfield:\ud158\u839e\u7006\uc3e3\u446c[](\u3bc9\u36d3\u4ab3\u8258\u6c52::\u3504\u927d\u7006\u494c\u760c, var_10_AC8:\u3bc9\u36d3\u4ab3\u8258\u6c52)
                        var_12_BD8 = arraylength:int(var_11_BD3:\ud158\u839e\u7006\uc3e3\u446c[])
                        var_13_BE1 = and:int(ldc:int(23748), ldc:int(-23749))
                        
                        loop {
                            var_5_AE8 = and:int(var_5_BCC:int, ldc:int(1002035223))
                            
                            if (cmpge:boolean(var_13_BE1:int, var_12_BD8:int)) {
                                looporswitchbreak()
                            }
                            
                            var_5_BCC = and:int(var_5_AE8:int, ldc:int(-1146488297))
                            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u527a\uc7fe\ub70c\uafe7\u6d99, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), loadelement:\ud158\u839e\u7006\uc3e3\u446c(var_11_BD3:\ud158\u839e\u7006\uc3e3\u446c[], var_13_BE1:int))
                            inc:int(var_13_BE1, ldc:int(1))
                        }
                        
                        Label_3094:
                        goto(Label_2157)
                    }
                }
            }
            
            Label_3101:
            return:void()
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
    
    public void \uc9f6\u34df\ucef1\u9937\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6A6 : int
        
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
        var_3_69B = and:int(ldc:int(-2039580495), ldc:int(-693404039))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub171\u8258\u59ec\ud4fe\u836c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_69B = and:int(var_3_69B:int, ldc:int(-684131587))
            var_5_80 = and:int(ldc:int(11794), ldc:int(-15892))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5151), ldc:int(1054)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_69B:int, ldc:int(-295764321))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, and:int(ldc:int(6185), ldc:int(1285)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(4230), ldc:int(4231)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_69B = and:int(var_3_CF:int, ldc:int(-1760854603))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(657), ldc:int(12297)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(506377400))
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1903360088))
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(434860055))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(2090425838))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1381230392))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1682180034))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-142267931))
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1143193761))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-702775777))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1667887070))
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1313926571))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1509435968))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-882765892))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(435772531))
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-386276851))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1505003149))
                        var_11_E0 = and:int(ldc:int(2444), ldc:int(-2445))
                        goto(Label_1599)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-114849702))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1394708135))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-684345868))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1862101619))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1957700647))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-798115352))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1975846441))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0752:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-923432354))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1417688666))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(912767))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(578258095))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1970639701))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(707511945))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-210142767))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1527322449))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(746810678))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1376056275))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-332643657))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1031241863))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(192), ldc:int(193))
                                goto(Label_1211)
                            }
                        }
                    }
                    
                    Label_1020:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(888614103))
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-917001134))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1294937899))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1884677099))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1409147615))
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1304868007))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(555168579))
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-257622699))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-491782759))
                        var_11_E0 = and:int(ldc:int(-14586), ldc:int(6392))
                    }
                    
                    Label_1211:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-667547870))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-223447019))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1455)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1620378573))
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1211)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1648437524))
                            goto(Label_1020)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(753567230))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-638904705))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(719610451))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1244786110))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-537331307))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1599)
                    }
                    
                    Label_1455:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1934603560))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1489823721))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1061196628))
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-838285070))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(762786473))
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69B = and:int(var_3_69B:int, ldc:int(-1899464559))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1599:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A6 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1610:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(989871447))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-2023064363))
                        var_17_6A6 = add:int(var_16_10E:int, xor:int(ldc:int(-27616), ldc:int(-27615)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69B = and:int(var_3_69B:int, ldc:int(-1220969323))
                
                if (cmple:boolean(var_5_80 = var_17_6A6:int, sub:int(var_6_87:int, xor:int(ldc:int(2212), ldc:int(2213))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
