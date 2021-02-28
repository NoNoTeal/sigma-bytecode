public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u0a06\u8753\ua3b4\u0c95\u4f52\u983f {
    private void \u0a06\u8753\ua3b4\u0c95\u4f52\u983f() {
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
            invokespecial:CacheLoader(CacheLoader::<init>, this:\u0a06\u8753\ua3b4\u0c95\u4f52\u983f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u36d3\u9033\u6b0d\u983f\u8d90.\u3504\ud158\ub8be\uc3e3\u4daf\ud523> load(java.lang.Long p0) {
        var_2_5F : int
        var_4_7C : List<? super Integer>
        var_5_91 : ArrayList
        var_6_9A : int
        var_2_A7 : int
        var_7_EB : int
        var_8_106 : int
        var_9_117 : int
        var_10_12B : int
        var_11_13A : int
        stack_181_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1967885353), ldc:int(-256169987))
            var_4_7C = checkcast:List<? super Integer>(java.util.List<? super java.lang.Integer>.class, invokeinterface:List<? super Integer>(Stream<Integer>::collect, invokeinterface:Stream<Integer>(IntStream::boxed, invokestatic:IntStream(IntStream::range, and:int(ldc:int(22946), ldc:int(-31220)), ldc:int(10))), invokestatic:Collector<Integer, ?, List<Integer>>(Collectors::toList)))
            invokestatic:void(Collections::shuffle, var_4_7C:List<? super Integer>, initobject:Random(Random::<init>, invokevirtual:long(Long::longValue, p0:Long)))
            var_5_91 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_9A = and:int(ldc:int(-3881), ldc:int(3880))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_A7 = and:int(var_2_5F:int, ldc:int(399855818))
                }
                else {
                    var_2_A7 = and:int(var_2_5F:int, ldc:int(-1366305359))
                    
                    if (cmplt:boolean(var_6_9A:int, ldc:int(10))) {
                        var_7_EB = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:double(ldc:double(42.0), invokestatic:double(Math::cos, mul:double(ldc:double(2.0), add:double(ldc:double(-3.141592653589793), mul:double(ldc:double(0.3141592653589793), i2d:double(var_6_9A:int)))))))
                        var_8_106 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:double(ldc:double(42.0), invokestatic:double(Math::sin, mul:double(ldc:double(2.0), add:double(ldc:double(-3.141592653589793), mul:double(ldc:double(0.3141592653589793), i2d:double(var_6_9A:int)))))))
                        var_9_117 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(List<Integer>::get, var_4_7C:List<Integer>, var_6_9A:int)))
                        var_10_12B = add:int(and:int(ldc:int(1038), ldc:int(14434)), div:int(var_9_117:int, xor:int(ldc:int(17217), ldc:int(17218))))
                        var_11_13A = add:int(ldc:int(76), mul:int(var_9_117:int, xor:int(ldc:int(42), ldc:int(41))))
                        
                        if (logicaland:boolean(cmpne:boolean(var_9_117:int, xor:int(ldc:int(12548), ldc:int(12549))), cmpne:boolean(var_9_117:int, and:int(ldc:int(582), ldc:int(130))))) {
                            var_2_5F = and:int(var_2_A7:int, ldc:int(708810413))
                            stack_181_0 = and:int(ldc:int(14695), ldc:int(-32104))
                        }
                        else {
                            var_2_5F = and:int(var_2_A7:int, ldc:int(-284189131))
                            stack_181_0 = and:int(ldc:int(1033), ldc:int(4679))
                        }
                        
                        invokeinterface:boolean(List<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>::add, var_5_91:ArrayList<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>[expected:List<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>], initobject:\u3504\ud158\ub8be\uc3e3\u4daf\ud523(\u3504\ud158\ub8be\uc3e3\u4daf\ud523::<init>, var_7_EB:int, var_8_106:int, var_10_12B:int, var_11_13A:int, stack_181_0:boolean))
                        inc:int(var_6_9A, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_A7:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_A7:int, ldc:int(796223405))
            }
            
            return:List<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>(var_5_91:ArrayList<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object load(java.lang.Object p0) {
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
            return:Object(invokevirtual:List<\u3504\ud158\ub8be\uc3e3\u4daf\ud523>[expected:Object](\u0a06\u8753\ua3b4\u0c95\u4f52\u983f::load, this:\u0a06\u8753\ua3b4\u0c95\u4f52\u983f, checkcast:Long(java.lang.Long.class, p0:Object[expected:Long])))
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u8753\ua3b4\u0c95\u4f52\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u92ee\u446c\u8389\u7006\u7049\u6bb9 p0) {
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
            invokespecial:\u0a06\u8753\ua3b4\u0c95\u4f52\u983f(\u0a06\u8753\ua3b4\u0c95\u4f52\u983f::<init>, this:\u0a06\u8753\ua3b4\u0c95\u4f52\u983f)
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
    
    public void \u7330\u0800\u392e\u5654\uf9c5\u600f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D2 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5DD : int
        
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
        var_3_5D2 = and:int(ldc:int(-2142215707), ldc:int(-1671794185))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\u8753\ua3b4\u0c95\u4f52\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1566787331))
            var_5_7D = and:int(ldc:int(6348), ldc:int(-14541))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30868), ldc:int(26770)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D2:int, ldc:int(-1565738261))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(14509), ldc:int(3)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-12032), ldc:int(-12031)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D2 = and:int(var_3_D2:int, ldc:int(-1379249431))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(12368), ldc:int(12369)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-609110476))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(350592497))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-107371687))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-344066919))
                    }
                    else {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1488920349))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0730)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2020026771))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-14149196))
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-323757963))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1724140827))
                            var_11_E3 = and:int(ldc:int(12134), ldc:int(-28520))
                            goto(Label_1357)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(524234975))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-206931213))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0730)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1774789723))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1902413583))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(96060925))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-279781907))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0730:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1254901263))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-211285693))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-350070932))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-249352269))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2113047305))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(340), ldc:int(341))
                                goto(Label_0986)
                            }
                        }
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-390335354))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2008880424))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-654833822))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1945588487))
                        var_11_E3 = and:int(ldc:int(-1199), ldc:int(1198))
                    }
                    
                    Label_0986:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1253966754))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1673727011))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1714002842))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(352244461))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-524391953))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1229)
                            }
                        }
                    }
                    
                    Label_1102:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(941394983))
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(443336063))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1466170670))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(64405477))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1930294041))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1357)
                    }
                    
                    Label_1229:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(2138538749))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-319394875))
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(334490433))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1850400554))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-921118983))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1357:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5DD = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1368:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-123858530))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1573805659))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(800113372))
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(839522399))
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(230938701))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-594213816))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-970178821))
                        var_17_5DD = add:int(var_16_111:int, and:int(ldc:int(16657), ldc:int(137)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1980364057))
                
                if (cmple:boolean(var_5_7D = var_17_5DD:int, sub:int(var_6_84:int, xor:int(ldc:int(12288), ldc:int(12289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(65536)), ldc:int(0))) {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(217804485))
            goto(Label_0106)
        }
    }
}
