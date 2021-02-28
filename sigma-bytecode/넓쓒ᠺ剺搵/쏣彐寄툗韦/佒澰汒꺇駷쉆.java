public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u4f52\u6fb0\u6c52\uae87\u99f7\uc246 {
    public void \u4f52\u6fb0\u6c52\uae87\u99f7\uc246() {
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
            invokespecial:Object(Object::<init>, this:\u4f52\u6fb0\u6c52\uae87\u99f7\uc246)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static float \u4f4a\u0800\u4c04\ua3b4\ub6ab\u3776(int p0, float p1, float p2, float p3) {
        var_4_68 : int
        var_6_6E : Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>
        var_7_7C : Integer
        var_8_92 : \u51b2\u97e6\u9255\ub102\u946b\u97e6
        stack_1FF_0 : float [generated]
        
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
        var_4_68 = and:int(and:int(ldc:int(-291382972), ldc:int(-566763571)), ldc:int(-818218243))
        monitorenter(var_6_6E = getstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b))
        
        try {
            var_4_68 = and:int(var_4_68:int, ldc:int(-822224604))
            var_7_7C = invokestatic:Integer(Integer::valueOf, p0:int)
            var_4_68 = and:int(var_4_68:int, ldc:int(-832439152))
            var_8_92 = checkcast:\u51b2\u97e6\u9255\ub102\u946b\u97e6(\u36d3\u9033\u6b0d\u983f\u8d90.\u51b2\u97e6\u9255\ub102\u946b\u97e6.class, invokeinterface:\u51b2\u97e6\u9255\ub102\u946b\u97e6(Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>::get, getstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b), var_7_7C:Integer[expected:Object]))
            
            loop {
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(872989438))
                    goto(Label_0434)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(1104468451))
                    goto(Label_0372)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(-750157152))
                    goto(Label_0291)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(-522383568))
                }
                else {
                    var_4_68 = and:int(var_4_68:int, ldc:int(-805905820))
                    
                    if (cmpne:boolean(var_8_92:\u51b2\u97e6\u9255\ub102\u946b\u97e6, aconstnull:\u51b2\u97e6\u9255\ub102\u946b\u97e6())) {
                        goto(Label_0434)
                    }
                }
                
                Label_0232:
                
                if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(1993886353))
                    goto(Label_0434)
                }
                
                if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0372)
                }
                
                if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(61400931))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_68 = and:int(var_4_68:int, ldc:int(-810754444))
                }
                
                Label_0291:
                
                if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(794723100))
                    goto(Label_0434)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(-1856472184))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_68 = and:int(var_4_68:int, ldc:int(-2085172232))
                        goto(Label_0232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_68 = and:int(var_4_68:int, ldc:int(-21897245))
                    var_8_92 = initobject:\u51b2\u97e6\u9255\ub102\u946b\u97e6(\u51b2\u97e6\u9255\ub102\u946b\u97e6::<init>, p1:float, p2:float, p3:float)
                }
                
                Label_0372:
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(124933993))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_68:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_68 = and:int(var_4_68:int, ldc:int(-12584066))
                    invokeinterface:\u51b2\u97e6\u9255\ub102\u946b\u97e6(Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>::put, getstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b), var_7_7C:Integer, var_8_92:\u51b2\u97e6\u9255\ub102\u946b\u97e6)
                }
                
                Label_0434:
                
                if (cmpeq:boolean(and:int(var_4_68:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_68 = and:int(var_4_68:int, ldc:int(1979365511))
                    goto(Label_0372)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0291)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0232)
                }
                
                if (cmpne:boolean(and:int(var_4_68:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_68 = and:int(var_4_68:int, ldc:int(-763141637))
            }
            
            var_4_68 = and:int(var_4_68:int, ldc:int(-567150113))
            stack_1FF_0 = invokevirtual:float(\u51b2\u97e6\u9255\ub102\u946b\u97e6::\ub18d\u385b\u4ab3\u7af6\u7006\u3d64, var_8_92:\u51b2\u97e6\u9255\ub102\u946b\u97e6, p1:float, p2:float, p3:float)
            monitorexit(var_6_6E:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>)
            var_4_68 = and:int(var_4_68:int, ldc:int(-21234398))
            return:float(stack_1FF_0:float)
        }
        finally {
            monitorexit(var_6_6E:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>)
        }
    }
    
    public static int \u64f2\ud158\uc84e\u494c\u8df4\u7330() {
        var_0_64 : int
        var_2_69 : \u92ff\ub113\ucef1\uc3e3\u8308\uceb8
        stack_7D_0 : int [generated]
        
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
        var_0_64 = and:int(and:int(ldc:int(-593192988), ldc:int(1290249974)), ldc:int(1860632318))
        monitorenter(var_2_69 = getstatic:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\u392e\uc229\uc84e\u8753\u7006\uc31c))
        
        try {
            var_0_64 = and:int(var_0_64:int, ldc:int(1815518452))
            stack_7D_0 = invokevirtual:int(\u92ff\ub113\ucef1\uc3e3\u8308\uceb8::\ub171\u416d\u120d\ud158\u51fa\ud7e8, getstatic:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\u392e\uc229\uc84e\u8753\u7006\uc31c))
            monitorexit(var_2_69:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8)
            var_0_64 = and:int(var_0_64:int, ldc:int(-718275340))
            return:int(stack_7D_0:int)
        }
        finally {
            monitorexit(var_2_69:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8)
        }
    }
    
    public static void \u6b0d\uff55\u4179\u4e72\ud523\ubefe() {
        var_0_BD : int
        var_2_69 : Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>
        
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
            var_0_BD = and:int(and:int(ldc:int(-361482040), ldc:int(-655082129)), ldc:int(-646467515))
            monitorenter(var_2_69 = getstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_0_BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_BD:int, ldc:int(512)), ldc:int(0))) {
                        var_0_BD = and:int(var_0_BD:int, ldc:int(-1805995267))
                    }
                    else {
                        var_0_BD = and:int(var_0_BD:int, ldc:int(-395004819))
                        invokeinterface:void(Map<K, V>::clear, getstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b))
                    }
                    
                    Label_0142:
                    
                    if (cmpne:boolean(and:int(var_0_BD:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_BD = and:int(var_0_BD:int, ldc:int(688460108))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_0_BD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_0_BD = and:int(var_0_BD:int, ldc:int(-1912637237))
                        monitorexit(var_2_69:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>)
                    }
                    
                    Label_0171:
                    
                    if (cmpeq:boolean(and:int(var_0_BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_BD:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_0_BD = and:int(var_0_BD:int, ldc:int(-1737163009))
            }
            finally {
                monitorexit(var_2_69:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>)
            }
            
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
            putstatic:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\ub32d\u67d0\ub113\u7873\u527a\u946b, initobject:HashMap<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>[expected:Map<Integer, \u51b2\u97e6\u9255\ub102\u946b\u97e6>](HashMap<K, V>::<init>))
            putstatic:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8(\u4f52\u6fb0\u6c52\uae87\u99f7\uc246::\u392e\uc229\uc84e\u8753\u7006\uc31c, initobject:\u92ff\ub113\ucef1\uc3e3\u8308\uceb8(\u92ff\ub113\ucef1\uc3e3\u8308\uceb8::<init>, and:int(ldc:int(5635), ldc:int(2313))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\u8cae\u64f2\u8aa5\u5654\ucef1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-235056026), ldc:int(-915447757))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\u6fb0\u6c52\uae87\u99f7\uc246[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-2088934941))
            var_5_7D = and:int(ldc:int(-26571), ldc:int(9666))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19977), ldc:int(-20122)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_634:int, ldc:int(-2023238921))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(24576), ldc:int(24577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16385), ldc:int(5)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D2:int, ldc:int(-605038221))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(6192), ldc:int(6193)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1356237131))
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1080823611))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1682197047))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-751506708))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2031371640))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(838700267))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2042370361))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1753793323))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1817311524))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1701271467))
                        var_11_E3 = and:int(ldc:int(-2470), ldc:int(2465))
                        goto(Label_1454)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-578844278))
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1230681960))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2120480480))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1784456600))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-776286352))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1387072222))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-973614662))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-440122216))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1277828513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(595590539))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1413888156))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-42469653))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1329917794))
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2129691654))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-199296378))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(48431833))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1198365686))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(6658), ldc:int(6659))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-485881484))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1976555425))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1139768174))
                        var_11_E3 = and:int(ldc:int(-858), ldc:int(857))
                    }
                    
                    Label_1027:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(720741714))
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(363416829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(810216441))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1265753749))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(849947676))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-482520455))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-77102686))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1161:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2040857795))
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(59776180))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-879128017))
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-185040018))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-960842660))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-578655138))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(303548449))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-135414081))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1454)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-468934633))
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1070507254))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1759386567))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-614471817))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-518078011))
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1887460113))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1454:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1465:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-584721139))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(250324664))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1575009473))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1941630197))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1669893869))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2056294165))
                        var_17_63F = add:int(var_16_111:int, and:int(ldc:int(17547), ldc:int(6161)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(1267688458))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-1015153742))
                
                if (cmple:boolean(var_5_7D = var_17_63F:int, sub:int(var_6_84:int, and:int(ldc:int(9233), ldc:int(2209))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-47036145))
            goto(Label_0106)
        }
    }
}
