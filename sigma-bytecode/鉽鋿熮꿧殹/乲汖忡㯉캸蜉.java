public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709 {
    public void \u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709(int p0) {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)
            putfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, p0:int)
            putfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, shr:int(p0:int, and:int(ldc:int(17057), ldc:int(10585))))
            putfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, shr:int(p0:int, xor:int(ldc:int(2050), ldc:int(2048))))
            putfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, shr:int(p0:int, xor:int(ldc:int(16915), ldc:int(16912))))
            
            switch (p0:int) {
                case 2048:
                    putfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, getstatic:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc2e8\u97b7\u4c04\u446c\u5db4\u873d))
                    goto(Label_0321)
                
                case 256:
                    putfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, getstatic:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8258\ub18d\ube23\u4d85\u36d3\u647c))
                    goto(Label_0321)
                
                case 1920:
                    putfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, getstatic:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u718f\u5f50\u7873\u51b2\u760c\u97e6))
                    goto(Label_0321)
                
                case 240:
                    putfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, getstatic:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u624e\u8df4\u4f4a\ubf56\u5d20\u1187))
                    looporswitchbreak()
            }
            
            athrow(initobject:\u8bb0\uae87\u0c95\u965f\u3e75\ufe34(\u8bb0\uae87\u0c95\u965f\u3e75\ufe34::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u0c95\u624e\u72f1\u6ec6\ub7dc\ubded), and:int(ldc:int(-13945), ldc:int(9848)))), p0:int))))
            Label_0321:
            putfield:\ud523\u1833\ud171\u47c2\u67e9\u3504(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u4ab3\u6b5f\u5654\u34df\u6c52\u3dd3, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, initobject:\ud523\u1833\ud171\u47c2\u67e9\u3504(\ud523\u1833\ud171\u47c2\u67e9\u3504::<init>, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)))
            putfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, multianewarray:float[][](float[][].class, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(96), ldc:int(98))))
            putfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709, newarray:float[](float.class, xor:int(ldc:int(408), ldc:int(410))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u6fb0\u8308\u759a\u4ab3\u9af2(float[] p0, int p1, float[] p2, int p3) {
        var_5_8B : int
        var_7_6A : int
        var_7_1DA : int
        
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
            var_5_8B = and:int(ldc:int(-591006496), ldc:int(516771310))
            var_7_6A = and:int(ldc:int(2609), ldc:int(-2612))
            
            loop {
                if (cmpeq:boolean(and:int(var_5_8B:int, ldc:int(67108864)), ldc:int(0))) {
                    var_5_8B = and:int(var_5_8B:int, ldc:int(-368036888))
                    goto(Label_0434)
                }
                
                if (cmpne:boolean(and:int(var_5_8B:int, ldc:int(524288)), ldc:int(0))) {
                    var_5_8B = and:int(var_5_8B:int, ldc:int(1889136369))
                }
                else {
                    var_5_8B = and:int(var_5_8B:int, ldc:int(-51096100))
                    
                    if (cmplt:boolean(var_7_6A:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))) {
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), xor:int(ldc:int(4128), ldc:int(4129)), add:float(mul:float(loadelement:float(p0:float[], add:int(p1:int, mul:int(xor:int(ldc:int(17793), ldc:int(17795)), var_7_6A:int))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(-19622), ldc:int(18597)))), mul:float(loadelement:float(p0:float[], sub:int(sub:int(add:int(p1:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), xor:int(ldc:int(12), ldc:int(13))), mul:int(and:int(ldc:int(26882), ldc:int(586)), var_7_6A:int))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(69), ldc:int(24627))))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(-29904), ldc:int(25738)), sub:float(mul:float(loadelement:float(p0:float[], sub:int(sub:int(add:int(p1:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(28691), ldc:int(73))), mul:int(xor:int(ldc:int(2090), ldc:int(2088)), var_7_6A:int))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(22353), ldc:int(-22354)))), mul:float(loadelement:float(p0:float[], add:int(p1:int, mul:int(and:int(ldc:int(522), ldc:int(2)), var_7_6A:int))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(24963), ldc:int(4201))))))
                        inc:int(var_7_6A, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0160:
                
                if (cmpeq:boolean(and:int(var_5_8B:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_8B = and:int(var_5_8B:int, ldc:int(999048940))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_8B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_5_8B = and:int(var_5_8B:int, ldc:int(-1576536940))
                        loopcontinue()
                    }
                    
                    var_5_8B = and:int(var_5_8B:int, ldc:int(-1661002002))
                    invokevirtual:void(\ud523\u1833\ud171\u47c2\u67e9\u3504::\u5bc4\u9033\ucb79\ub171\ua068\ubff1, getfield:\ud523\u1833\ud171\u47c2\u67e9\u3504(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u4ab3\u6b5f\u5654\u34df\u6c52\u3dd3, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int[expected:boolean](ldc:int(-25470), ldc:int(25101)))
                    var_7_6A = and:int(ldc:int(5177), ldc:int(-5946))
                    
                    while (cmplt:boolean(var_7_6A:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))) {
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(24890), ldc:int(-25083)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(-24993), ldc:int(24992))))
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(-30200), ldc:int(-30199)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), xor:int(ldc:int(28704), ldc:int(28705))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(8197), ldc:int(4115)), add:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(16393), ldc:int(1027))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(1331), ldc:int(-3380)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(3228), ldc:int(-3485))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), xor:int(ldc:int(28674), ldc:int(28675))))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(-23852), ldc:int(19754)), sub:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(18765), ldc:int(-18894))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(-21042), ldc:int(21041)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(263), ldc:int(262))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_6A:int), and:int(ldc:int(2161), ldc:int(1539))))))
                        inc:int(var_7_6A, ldc:int(1))
                    }
                }
                
                Label_0434:
                
                if (cmpne:boolean(and:int(var_5_8B:int, ldc:int(524288)), ldc:int(0))) {
                    var_5_8B = and:int(var_5_8B:int, ldc:int(1219528892))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_5_8B:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_7_1DA = and:int(ldc:int(1114), ldc:int(-1888))
            
            while (cmplt:boolean(var_7_1DA:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))) {
                storeelement:float(p2:float[], add:int(p3:int, mul:int(and:int(ldc:int(202), ldc:int(2306)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_1DA:int)), xor:int(ldc:int(-31584), ldc:int(-31583))))
                storeelement:float(p2:float[], add:int(add:int(p3:int, and:int(ldc:int(25642), ldc:int(134))), mul:int(and:int(ldc:int(34), ldc:int(17410)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(900), ldc:int(901))), var_7_1DA:int)), and:int(ldc:int(129), ldc:int(16509))))
                storeelement:float(p2:float[], add:int(add:int(p3:int, and:int(ldc:int(12403), ldc:int(1153))), mul:int(xor:int(ldc:int(17729), ldc:int(17731)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(18433), ldc:int(4227))), var_7_1DA:int)), and:int(ldc:int(27718), ldc:int(-27719)))))
                storeelement:float(p2:float[], add:int(add:int(p3:int, xor:int(ldc:int(682), ldc:int(681))), mul:int(xor:int(ldc:int(-16363), ldc:int(-16361)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(16385), ldc:int(16387))), var_7_1DA:int)), and:int(ldc:int(-32203), ldc:int(15754)))))
                storeelement:float(p2:float[], add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), mul:int(xor:int(ldc:int(517), ldc:int(519)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_1DA:int), and:int(ldc:int(-2808), ldc:int(2743))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), xor:int(ldc:int(5216), ldc:int(5218))), mul:int(xor:int(ldc:int(613), ldc:int(615)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(and:int(ldc:int(2609), ldc:int(9485)), var_7_1DA:int)), and:int(ldc:int(-7315), ldc:int(7314))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(16389), ldc:int(15417))), mul:int(xor:int(ldc:int(4194), ldc:int(4192)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(16386), ldc:int(16387))), var_7_1DA:int)), xor:int(ldc:int(-16240), ldc:int(-16239)))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(29771), ldc:int(263))), mul:int(and:int(ldc:int(6914), ldc:int(6)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(8194), ldc:int(16646))), var_7_1DA:int)), and:int(ldc:int(10257), ldc:int(4097)))))
                storeelement:float(p2:float[], add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), mul:int(xor:int(ldc:int(-24541), ldc:int(-24543)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_1DA:int)), and:int(ldc:int(-10439), ldc:int(10438))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(24730), ldc:int(1030))), mul:int(and:int(ldc:int(16394), ldc:int(6258)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(4122), ldc:int(4123))), var_7_1DA:int)), and:int(ldc:int(-31115), ldc:int(31106))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), xor:int(ldc:int(278), ldc:int(279))), mul:int(and:int(ldc:int(12298), ldc:int(2882)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(8993), ldc:int(20623))), var_7_1DA:int)), xor:int(ldc:int(3168), ldc:int(3169)))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(18567), ldc:int(35))), mul:int(xor:int(ldc:int(29696), ldc:int(29698)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(20638), ldc:int(8195))), var_7_1DA:int)), and:int(ldc:int(785), ldc:int(31755)))))
                storeelement:float(p2:float[], add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), mul:int(and:int(ldc:int(25346), ldc:int(2050)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_7_1DA:int), xor:int(ldc:int(18946), ldc:int(18947)))))
                storeelement:float(p2:float[], add:int(add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), xor:int(ldc:int(-22524), ldc:int(-22522))), mul:int(and:int(ldc:int(3715), ldc:int(16682)), var_7_1DA:int)), neg:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(and:int(ldc:int(16517), ldc:int(4929)), var_7_1DA:int)), xor:int(ldc:int(6161), ldc:int(6160)))))
                storeelement:float(p2:float[], add:int(add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(22051), ldc:int(2057))), mul:int(and:int(ldc:int(17319), ldc:int(2066)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(-15344), ldc:int(-15343))), var_7_1DA:int)), and:int(ldc:int(26682), ldc:int(-26684))))
                storeelement:float(p2:float[], add:int(add:int(add:int(add:int(p3:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(24843), ldc:int(3))), mul:int(and:int(ldc:int(2386), ldc:int(24714)), var_7_1DA:int)), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(2194), ldc:int(1387))), var_7_1DA:int)), and:int(ldc:int(1624), ldc:int(-1625))))
                inc:int(var_7_1DA, ldc:int(2))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9033\u927d\u12cb\u72f1\u5654\u6c52(float[] p0, float[] p1) {
        var_3_5F : int
        var_5_67 : int
        var_6_BE : int
        expr_1AE : float[] [generated]
        expr_1B5 : int [generated]
        expr_1C5 : float[] [generated]
        expr_1CC : int [generated]
        expr_2D8 : float[] [generated]
        expr_2DF : int [generated]
        expr_2F4 : float[] [generated]
        expr_2FB : int [generated]
        var_5_AB : int
        var_6_32C : int
        
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
            var_3_5F = and:int(ldc:int(1910965924), ldc:int(2070368821))
            var_5_67 = and:int(ldc:int(-1688), ldc:int(1558))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-68697372))
                    
                    if (cmplt:boolean(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))) {
                        var_6_BE = shl:int(var_5_67:int, and:int(ldc:int(517), ldc:int(67)))
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(-25707), ldc:int(25674)), add:float(loadelement:float(p0:float[], sub:int(sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), and:int(ldc:int(30793), ldc:int(1043))), var_6_BE:int)), loadelement:float(p0:float[], add:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)), var_6_BE:int))))
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(9360), ldc:int(9361)), sub:float(loadelement:float(p0:float[], add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_6_BE:int)), loadelement:float(p0:float[], sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(129), ldc:int(11793))), var_6_BE:int))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), and:int(ldc:int(-27277), ldc:int(27264)), add:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(2225), ldc:int(-18612))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), and:int(ldc:int(-17423), ldc:int(17422)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(-14080), ldc:int(-14079))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), xor:int(ldc:int(12420), ldc:int(12421))))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), and:int(ldc:int(613), ldc:int(2329)), sub:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(2572), ldc:int(2573))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), and:int(ldc:int(-8133), ldc:int(8128)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(-28228), ldc:int(9795))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int), and:int(ldc:int(22277), ldc:int(65))))))
                        expr_1AE = loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int)
                        expr_1B5 = and:int(ldc:int(-1036), ldc:int(1035))
                        storeelement:float(expr_1AE:float[], expr_1B5:int, mul:float(loadelement:float(expr_1AE:float[], expr_1B5:int), i2f:float(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))))
                        expr_1C5 = loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_67:int)
                        expr_1CC = and:int(ldc:int(6151), ldc:int(9217))
                        storeelement:float(expr_1C5:float[], expr_1CC:int, mul:float(loadelement:float(expr_1C5:float[], expr_1CC:int), i2f:float(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))))
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(20096), ldc:int(-20115)), sub:float(loadelement:float(p0:float[], sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(26049), ldc:int(4129))), var_6_BE:int)), loadelement:float(p0:float[], var_6_BE:int)))
                        storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(9250), ldc:int(9251)), add:float(loadelement:float(p0:float[], add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_6_BE:int)), loadelement:float(p0:float[], sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(1413), ldc:int(6195))), var_6_BE:int))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), and:int(ldc:int(5502), ldc:int(-21887)), add:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(-24355), ldc:int(23330))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), and:int(ldc:int(26646), ldc:int(-26680)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(26649), ldc:int(513))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), xor:int(ldc:int(2216), ldc:int(2217))))))
                        storeelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), and:int(ldc:int(8451), ldc:int(2689)), sub:float(mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(11329), ldc:int(16565))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), and:int(ldc:int(-4776), ldc:int(4775)))), mul:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(17460), ldc:int(-17597))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))), xor:int(ldc:int(4140), ldc:int(4141))))))
                        expr_2D8 = loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)))
                        expr_2DF = and:int(ldc:int(-26947), ldc:int(26946))
                        storeelement:float(expr_2D8:float[], expr_2DF:int, mul:float(loadelement:float(expr_2D8:float[], expr_2DF:int), i2f:float(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))))
                        expr_2F4 = loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), add:int(var_5_67:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u6c52\uf995\u494c\ucfaf\u97b7\u7330, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709)))
                        expr_2FB = xor:int(ldc:int(9288), ldc:int(9289))
                        storeelement:float(expr_2F4:float[], expr_2FB:int, mul:float(loadelement:float(expr_2F4:float[], expr_2FB:int), i2f:float(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))))
                        inc:int(var_5_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(-523487385))
            }
            
            invokevirtual:void(\ud523\u1833\ud171\u47c2\u67e9\u3504::\u5bc4\u9033\ucb79\ub171\ua068\ubff1, getfield:\ud523\u1833\ud171\u47c2\u67e9\u3504(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u4ab3\u6b5f\u5654\u34df\u6c52\u3dd3, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int[expected:boolean](ldc:int(3), ldc:int(2)))
            var_5_AB = and:int(ldc:int(-14778), ldc:int(6457))
            
            while (cmplt:boolean(var_5_AB:int, getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u3504\u9937\u8640\ua562\u16f6\ubf56, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709))) {
                var_6_32C = shl:int(var_5_AB:int, xor:int(ldc:int(160), ldc:int(161)))
                storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(24841), ldc:int(-24874)), add:float(mul:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(29456), ldc:int(-29463))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(-30175), ldc:int(25814)))), mul:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), xor:int(ldc:int(130), ldc:int(131))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(17671), ldc:int(9))))))
                storeelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(6669), ldc:int(24577)), sub:float(mul:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(20995), ldc:int(8681))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(-13605), ldc:int(13604)))), mul:float(loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u7049\u59ec\ua562\u4c2b\uc87f\uc4d2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), and:int(ldc:int(19978), ldc:int(-19979))), loadelement:float(loadelement:float[](getfield:float[][](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8df4\u3bc9\uc2e8\uf995\uc2e8\u8cae, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_5_AB:int), xor:int(ldc:int(16577), ldc:int(16576))))))
                storeelement:float(p1:float[], var_6_32C:int, neg:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(10876), ldc:int(-14976)))))
                storeelement:float(p1:float[], sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(24656), ldc:int(24657))), var_6_32C:int), loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(-32472), ldc:int(-32471))))
                storeelement:float(p1:float[], add:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u836c\u6ec6\u8308\uceb8\u8413\ubcb0, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), var_6_32C:int), neg:float(loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(-32736), ldc:int(-32735)))))
                storeelement:float(p1:float[], sub:int(sub:int(getfield:int(\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\uc31c\u4e72\u52d3\u69d9\u98a4\u4e72, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), xor:int(ldc:int(2115), ldc:int(2114))), var_6_32C:int), loadelement:float(getfield:float[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u8aa5\u4f52\u6435\uc2bd\u4c04\u7873, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709), and:int(ldc:int(9580), ldc:int(-13805))))
                inc:int(var_5_AB, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_A6_0 : byte[] [generated]
        stack_A8_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_13E_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        stack_23F_0 : byte[] [generated]
        stack_2B7_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_186 : byte[]
        var_4_187 : int
        var_0_22D : int
        expr_A8 : int [generated]
        var_5_1D6 : int
        var_3_1DB : byte[]
        var_4_1DC : int
        var_0_235 : int
        expr_23F : byte [generated]
        stack_283_2 : byte [generated]
        stack_262_0 : byte [generated]
        expr_DB : int [generated]
        expr_116 : int [generated]
        var_3_2A6 : byte[]
        var_4_2A7 : int
        expr_2BA : byte [generated]
        var_3_14A : String
        stack_17D_0 : String[] [generated]
        expr_15C : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-1187708316), ldc:int(2087899316))
            expr_65 = var_2_69 = stack_A6_0 = stack_A8_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1F3_0 = stack_23F_0 = stack_2B7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BnI4WnJ6/hY8O+LByoaSmonepNYIAioNuYA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_186 = newarray:byte[](byte.class, expr_6D:int)
                var_4_187 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-74106309))
                    var_4_187 = add:int(var_4_187:int, ldc:int(-1))
                    storeelement:byte(var_3_186:byte[], var_4_187:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_187:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_187:int, xor:int(ldc:int(1300), ldc:int(1301)))), ldc:int(5)), xor:int(ldc:int(341), ldc:int(338)))))
                    
                    if (cmpne:boolean(var_4_187:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1F3_0 = stack_23F_0 = stack_2B7_0 = var_3_186:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_5F:int, ldc:int(725582188))
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_5F:int, ldc:int(1307304382))
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_5F:int, ldc:int(-1456164078))
                    goto(Label_0173)
                }
                
                var_0_22D = and:int(var_0_5F:int, ldc:int(-370038039))
                expr_A8 = arraylength:int(stack_A8_0:byte[])
                
                if (cmpeq:boolean(expr_A8:int, ldc:int(0))) {
                    goto(Label_0173)
                }
                
                var_5_1D6 = expr_A8:int
                var_3_1DB = newarray:byte[](byte.class, expr_A8:int)
                var_4_1DC = expr_A8:int
                Label_0478:
                
                while (cmpeq:boolean(and:int(var_0_22D:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_22D:int, ldc:int(-1411390230))
                    var_4_1DC = add:int(var_4_1DC:int, ldc:int(-1))
                    storeelement:byte(var_3_1DB:byte[], var_4_1DC:int, add:byte(loadelement:byte(stack_1F3_0:byte[], var_4_1DC:int), ldc:byte(46)))
                    
                    if (cmpne:boolean(var_4_1DC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1F3_0 = stack_23F_0 = stack_2B7_0 = var_3_1DB:byte[]
                    goto(Label_0173)
                }
                
                Label_0546:
                
                while (cmpne:boolean(and:int(var_0_22D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_22D:int, ldc:int(2098341298))
                    var_4_1DC = add:int(var_4_1DC:int, ldc:int(-1))
                    expr_23F = stack_283_2 = loadelement(stack_23F_0, var_4_1DC)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1DC:int, ldc:int(6)), neg:int(var_5_1D6:int)), ldc:int(0))) {
                        stack_283_2 = stack_262_0 = add:byte(expr_23F:byte, loadelement:byte(var_3_1DB:byte[], add:int(var_4_1DC:int, ldc:int(6))))
                        goto(Label_0626)
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_0_235:int, ldc:int(4096)), ldc:int(0))) {
                        var_0_235 = and:int(var_0_235:int, ldc:int(-279538018))
                    }
                    else {
                        var_0_235 = and:int(var_0_235:int, ldc:int(692044212))
                        stack_283_2 = stack_262_0 = add:byte(expr_23F:byte, ldc:byte(6))
                    }
                    
                    Label_0626:
                    
                    if (cmpne:boolean(and:int(var_0_235:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    var_0_22D = and:int(var_0_235:int, ldc:int(-272855628))
                    storeelement:byte(var_3_1DB:byte[], var_4_1DC:int, stack_283_2:byte)
                    
                    if (cmpne:boolean(var_4_1DC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1F3_0 = stack_23F_0 = stack_2B7_0 = var_3_1DB:byte[]
                    goto(Label_0224)
                }
                
                var_0_22D = and:int(var_0_22D:int, ldc:int(-1040658140))
                goto(Label_0478)
                Label_0173:
                
                if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_22D:int, ldc:int(-986964014))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_22D:int, ldc:int(553964125))
                        loopcontinue()
                    }
                    
                    var_0_22D = and:int(var_0_22D:int, ldc:int(1815223778))
                    expr_DB = arraylength:int(stack_DB_0:byte[])
                    
                    if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                        var_5_1D6 = expr_DB:int
                        var_3_1DB = newarray:byte[](byte.class, expr_DB:int)
                        var_4_1DC = expr_DB:int
                        goto(Label_0546)
                    }
                }
                
                Label_0224:
                
                if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_22D:int, ldc:int(-2071483722))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_22D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_22D = and:int(var_0_22D:int, ldc:int(-899024263))
                        goto(Label_0173)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(4096)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_22D:int, ldc:int(-660442897))
                        loopcontinue()
                    }
                    
                    var_0_22D = and:int(var_0_22D:int, ldc:int(-46181581))
                    expr_116 = arraylength:int(stack_116_0:byte[])
                    
                    if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                        var_3_2A6 = newarray:byte[](byte.class, expr_116:int)
                        var_4_2A7 = expr_116:int
                        
                        loop {
                            var_0_22D = and:int(var_0_22D:int, ldc:int(-1392650714))
                            var_4_2A7 = add:int(var_4_2A7:int, ldc:int(-1))
                            expr_2BA = xor:byte(loadelement:byte(stack_2B7_0:byte[], var_4_2A7:int), ldc:byte(2))
                            storeelement:byte(var_3_2A6:byte[], var_4_2A7:int, or:int(and:int(shl:int(expr_2BA:byte, xor:int(ldc:int(-24414), ldc:int(-24410))), ldc:int(-16)), and:int(shr:int(expr_2BA:byte[expected:int], and:int(ldc:int(12836), ldc:int(3468))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2A7:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1F3_0 = stack_23F_0 = stack_2B7_0 = var_3_2A6:byte[]
                    }
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_0_22D:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0173)
                }
                
                if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_22D:int, ldc:int(1616439117))
            }
            
            var_3_14A = initobject:String(String::<init>, stack_13E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_17D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(192), ldc:int(193)))
            expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8785), ldc:int(291)))
            storeelement:String(expr_15C:String[], and:int(ldc:int(5077), ldc:int(-13272)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(-6805), ldc:int(6676)), xor:int(ldc:int(8716), ldc:int(8725))))
            putstatic:String[](\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709::\u0c95\u624e\u72f1\u6ec6\ub7dc\ubded, expr_15C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u9937\u88c5\u92ee\u69d9\u56bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_685 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_690 : int
        
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
        var_3_685 = and:int(ldc:int(1705322956), ldc:int(1067891839))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u6c56\u5fe1\u3bc9\uceb8\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(-405363827))
            var_5_7D = and:int(ldc:int(21266), ldc:int(-23315))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(32012), ldc:int(-32029)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_685:int, ldc:int(-542269123))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(77), ldc:int(8595)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(14341), ldc:int(16643)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_685 = and:int(var_3_CA:int, ldc:int(-307924787))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17504), ldc:int(17505)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1584947154))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-861700493))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-679408697))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1094565879))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(93167460))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-570363525))
                    }
                    else {
                        var_3_685 = and:int(var_3_685:int, ldc:int(92716604))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1078838520))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1875813892))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-55614159))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-292249930))
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1378955648))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2130291347))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1115263249))
                        var_11_DB = and:int(ldc:int(-3915), ldc:int(3914))
                        goto(Label_1542)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(246152338))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-230539422))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(401997986))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-35803075))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1202999111))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(816882398))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-806443538))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(62906627))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1717481305))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1698196577))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1251725378))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1570374304))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-635234926))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1248954878))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1474571967))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(13067), ldc:int(17))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-68112063))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(175901015))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1184319629))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1523381905))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1810854042))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1824366855))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1843674239))
                        var_11_DB = and:int(ldc:int(-1152), ldc:int(1151))
                    }
                    
                    Label_1126:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(20387982))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-659089923))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2104696928))
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(589514861))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2117644570))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1078034932))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1254:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1475377032))
                            goto(Label_1126)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1195870747))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1981676831))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(59158357))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(130459758))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1542)
                    }
                    
                    Label_1385:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-19944927))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-355695947))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1410231484))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2122081920))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1353416590))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-274510175))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1354165619))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-941284145))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1542:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_690 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1553:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2003647326))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(538053393))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1013577532))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1369766251))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2113203853))
                        var_17_690 = add:int(var_16_109:int, xor:int(ldc:int(16428), ldc:int(16429)))
                        looporswitchbreak()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(500840307))
                }
                
                var_3_685 = and:int(var_3_685:int, ldc:int(2111306175))
                
                if (cmple:boolean(var_5_7D = var_17_690:int, sub:int(var_6_84:int, xor:int(ldc:int(16472), ldc:int(16473))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
